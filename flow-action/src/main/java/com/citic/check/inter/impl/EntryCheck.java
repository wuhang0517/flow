package com.citic.check.inter.impl;

import com.citic.base.pojo.check.CheckResponse;
import com.citic.check.inter.CheckInter;
import com.citic.check.pojo.Entry;
import com.citic.check.pojo.EntryCheckRequestParam;

/**
 * @ClassName EntryCheck
 * @Description 报关单的检查
 * @Author lin
 * @Date 2020/8/11 19:46
 * @Version 1.0
 */
public class EntryCheck implements CheckInter<EntryCheckRequestParam> {
    @Override
    public CheckResponse baseCheck(EntryCheckRequestParam requestParam) {
        Entry entry = requestParam.getRequestParam();
        System.out.println(entry.getEntryId());
        CheckResponse response = new CheckResponse();
        response.setModelName(requestParam.getModelName());
        response.setRet(true);
        response.setCheckResult("报关单检查通过");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }
}
