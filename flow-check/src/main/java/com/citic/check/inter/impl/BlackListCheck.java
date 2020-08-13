package com.citic.check.inter.impl;

import com.citic.base.pojo.check.CheckResponse;
import com.citic.check.inter.CheckInter;
import com.citic.check.pojo.BlackList;
import com.citic.check.pojo.BlackListCheckRequestParam;

/**
 * @ClassName BlackListCheck
 * @Description 黑名单筛查
 * @Author lin
 * @Date 2020/8/13 09:07
 * @Version 1.0
 */
public class BlackListCheck implements CheckInter<BlackListCheckRequestParam> {
    @Override
    public CheckResponse baseCheck(BlackListCheckRequestParam requestParam) {
        BlackList blackList = requestParam.getRequestParam();
        System.out.println(blackList.getId());
        CheckResponse response = new CheckResponse();
        response.setModelName(requestParam.getModelName());
        response.setRet(false);
        response.setCheckResult("黑名单校验不通过不通过");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }
}
