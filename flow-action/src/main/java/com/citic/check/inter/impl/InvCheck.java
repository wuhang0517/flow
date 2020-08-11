package com.citic.check.inter.impl;

import com.citic.base.pojo.check.CheckResponse;
import com.citic.check.pojo.InvCheckRequestParam;
import com.citic.check.pojo.InvPojo;
import com.citic.check.inter.CheckInter;

/**
 * @ClassName InvCheck
 * @Description 发票的查验
 * @Author lin
 * @Date 2020/8/6 23:10
 * @Version 1.0
 */
public class InvCheck implements CheckInter<InvCheckRequestParam> {

    @Override
    public CheckResponse baseCheck(InvCheckRequestParam requestParam) {
        InvPojo invPojo = requestParam.getRequestParam();
        System.out.println(invPojo.getInvNo());
        CheckResponse response = new CheckResponse();
        response.setModelName(requestParam.getModelName());
        response.setRet(false);
        response.setCheckResult("发票查验不通过");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }
}
