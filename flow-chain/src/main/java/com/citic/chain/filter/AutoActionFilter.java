package com.citic.chain.filter;

import com.citic.base.pojo.oure.BasePojo;
import com.citic.oure.pojo.ZxcwOurePojo;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;

/**
 * @ClassName AutoActionFilter
 * @Description 自动化流程
 * @Author lin
 * @Date 2020/12/13 下午10:14
 * @Version 1.0
 */
public class AutoActionFilter<T extends BasePojo> implements Filter {

    /**
     * 自动话流程执行完成后执行的动作
     *
     * @param context
     * @param e
     * @return
     */
    @Override
    public boolean postprocess(Context context, Exception e) {

        Boolean result = (Boolean) context.get("result");
        if (result) {
            System.out.println("校验通过，执行自动化流程");
            return false;
        }
        System.out.println("校验不通过，落人工");
        return true;
    }

    /**
     * 发起自动话流程需要执行的动作，对国结系统来说，是获取数据
     *
     * @param context
     * @return
     * @throws Exception
     */
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("开始执行自动化流程");
        ZxcwOurePojo pojo = new ZxcwOurePojo();
        pojo.setApplNo("123456");
        pojo.setApplType("EZSHP");
        pojo.setTrxCode("711101");
        pojo.setInvCode("123");
        pojo.setBlackList("456");

        context.put("pojo", pojo);
        return false;
    }

}
