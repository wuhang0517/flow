package com.citic.check;

import com.citic.base.pojo.ApiResponse;
import com.citic.base.pojo.check.CheckRequestParam;
import com.citic.base.pojo.check.CheckResponse;
import com.citic.check.inter.CheckInter;
import com.citic.check.mapper.CheckModelRelMapper;
import com.citic.check.pojo.CheckModelRel;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @ClassName CheckManager
 * @Description 检查的统一管理
 * @Author lin
 * @Date 2020/8/7 00:15
 * @Version 1.0
 */
@Component
public class CheckManager {

    private static Map<String, List<CheckInter<CheckRequestParam>>> checkMap = new HashMap<>();

    private static Map<Class<? extends CheckInter>, CheckRequestParam> paramMap = new HashMap<>();

    //并行检查的线程池大小
    static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

    // 0 串行检查 串行检查时，检查不通过直接返回 1 并行检查，并行检查时需要制定线程池大小，全部检查通过后返回
    static String CHECK_MODEL = "0";

    private static CheckModelRelMapper checkModelRelMapper;

    @Autowired
    public void setCheckModelRelMapper(CheckModelRelMapper checkModelRelMapper) {
        CheckManager.checkModelRelMapper = checkModelRelMapper;
    }

    /**
     * 获取渠道需要检查的项
     *
     * @param tradeType 渠道类型
     */
    private static void getCheckInter(String tradeType) {
        List<CheckModelRel> checkModelRels = checkModelRelMapper.selectCheckModelByTradetype(tradeType);
        List<CheckInter<CheckRequestParam>> checkInters = new ArrayList<>();
        try {
            for (CheckModelRel checkModelRel : checkModelRels) {
                if (checkModelRel.getIsChecked() == 0) {
                    CheckInter inter = (CheckInter) Class.forName(checkModelRel.getCheckModulePath()).newInstance();
                    CheckRequestParam param = (CheckRequestParam) Class.forName(checkModelRel.getCheckModuleParamPath()).newInstance();

                    checkInters.add(inter);
                    paramMap.put(inter.getClass(), param);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            //todo 记录日志
        }

        checkMap.put(tradeType, checkInters);

    }

    /**
     * 对渠道需要检查的项进行检查
     *
     * @param tradeType 渠道类型
     * @param applNo 申请编号
     * @param cMainRef 主流水号
     * @return
     * @throws Exception
     */
    public static ApiResponse<List<CheckResponse>> check(String tradeType, String applNo, String cMainRef) {
        List<CheckInter<CheckRequestParam>> checkInters = checkMap.get(tradeType);
        //初始化
        if (checkInters == null || checkInters.size() == 0) {
            getCheckInter(tradeType);
            checkInters = checkMap.get(tradeType);
        }
        if (checkInters == null || checkInters.size() < 1) {
            return ApiResponse.fail("-1", "获取检查列表为空");
        }
        List<CheckResponse> responses = new ArrayList<>();
        switch (CHECK_MODEL) {
            case "0":
                responses = serialAction(checkInters, applNo, cMainRef);
                break;
            case "1":
                responses = parallelAction(checkInters, applNo, cMainRef);
                if (responses.size() < 1) {
                    return ApiResponse.fail("-1", "获取检查结果失败");
                }
                break;
            default:
                return ApiResponse.fail("-1", "检查类型不符");
        }
        return checkResult(responses);
    }

    /**
     * 并行检查
     *
     * @param checkInters
     * @param applNo
     * @param cMainRef
     * @return
     */
    private static List<CheckResponse> parallelAction(List<CheckInter<CheckRequestParam>> checkInters, String applNo, String cMainRef) {
        List<CheckResponse> responses = new ArrayList<>();
        List<Future<CheckResponse>> futures = new ArrayList<>();
        int size = checkInters.size();
        for (int i = 0; i < size; i++) {
            CheckRequestParam param = paramMap.get(checkInters.get(i).getClass());
            param.setApplNo(applNo);
            param.setCMainRef(cMainRef);
            // 多线程执行
            Callable<CheckResponse> callable = new CheckThread(checkInters.get(i), param);
            Future<CheckResponse> response = executor.submit(callable);
            futures.add(response);
        }
        //检查任务是否执行完成
        do {
            for (int i = 0; i < futures.size(); i++) {
                Future<CheckResponse> response = futures.get(i);
                if (!response.isDone()) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        break;
                    }
                }

            }
        } while (executor.getCompletedTaskCount() < futures.size());
        //获取执行结果
        for (int i = 0; i < futures.size(); i++) {
            Future<CheckResponse> response = futures.get(i);
            try {
                // future.get 是一个阻断方法，如果在阻塞的过程中被(其他线程)中断，则抛出InterruptedException。
                responses.add(response.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return responses;
    }

    /**
     * 串行检查
     *
     * @param checkInters 需要检查的项
     * @param applNo 申请编号
     * @param cMainRef 主流水号
     * @return
     */
    private static List<CheckResponse> serialAction(List<CheckInter<CheckRequestParam>> checkInters, String applNo, String cMainRef) {
        List<CheckResponse> responses = new ArrayList<>();
        int size = checkInters.size();
        for (int i = 0; i < size; i++) {
            CheckRequestParam param = paramMap.get(checkInters.get(i).getClass());
            param.setApplNo(applNo);
            param.setCMainRef(cMainRef);
            CheckResponse response = checkInters.get(i).baseCheck(param);
            if (!response.isRet()) {
                responses.add(response);
                break;
            }
        }
        return responses;
    }

    /**
     * 拼装返回信息
     *
     * @param responses
     * @return
     */
    private static ApiResponse<List<CheckResponse>> checkResult(List<CheckResponse> responses) {
        StringBuffer resultSb = new StringBuffer();
        responses.forEach(response -> {
            if (!response.isRet()) {
                resultSb.append(response.getModelName()).append(":").append(response.getCheckResult());
                resultSb.append(";");
            }
        });
        if (!Strings.isNullOrEmpty(resultSb.toString())) {
            return ApiResponse.fail("-1", resultSb.toString(), responses);
        }
        return ApiResponse.suc("", "");
    }

    /**
     * 并行任务执行的线程
     */
    private static class CheckThread implements Callable<CheckResponse> {

        private CheckInter<CheckRequestParam> checkInter;

        private CheckRequestParam param;

        public CheckThread(CheckInter<CheckRequestParam> checkInter, CheckRequestParam param) {
            this.checkInter = checkInter;
            this.param = param;
        }

        @Override
        public CheckResponse call() throws Exception {
            return checkInter.baseCheck(param);
        }
    }

}
