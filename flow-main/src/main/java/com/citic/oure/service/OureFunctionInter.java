package com.citic.oure.service;

import com.citic.base.pojo.ApiResponse;
import com.citic.base.pojo.oure.SysOureVo;

/**
 * @ClassName OureFunctionInter
 * @Description 汇出汇款的功能接口
 * @Author lin
 * @Date 2020/8/21 08:35
 * @Version 1.0
 */
public interface OureFunctionInter<T extends SysOureVo> {

    /**
     * 不同渠道的个性话校验，主要针对防重校验
     *
     * @param oureVo 校验汇出汇款的实体类
     * @param xml 报文
     * @return
     */
    ApiResponse firstCheck(T oureVo, String xml);

    /**
     * 汇出汇款的实体类型
     *
     * @param oureVo
     * @return
     */
    ApiResponse receiveOureRequest(T oureVo);

    /**
     * 通过校验服务做的校验。如黑名单筛查等
     *
     * @param oureVo
     * @return
     */
    ApiResponse checkByCheckServer(T oureVo);

    /**
     * 准备自动化流程的数据
     *
     * @param prepareParam 自动
     * @return
     */
    ApiResponse<T> prepareAutoOureData(String prepareParam);

    /**
     * 执行自动化流程
     *
     * @param oureVo
     */
    void autoOureFlow(T oureVo);


    /**
     * 自动化流程成功后执行的动作
     *
     * @param oureVo
     */
    void successAutoOureFlow(T oureVo);

    /**
     * 自动话流程失败后执行的动作
     *
     * @param oureVo
     */
    void failAutoOureFlow(T oureVo);
}
