package com.citic.check.pojo;

import com.citic.base.pojo.check.CheckRequestParam;

/**
 * @ClassName BlackListCheckRequestParam
 * @Description 黑名单检查的需要的参数
 * @Author lin
 * @Date 2020/8/13 09:10
 * @Version 1.0
 */
public class BlackListCheckRequestParam extends CheckRequestParam<BlackList> {

    public BlackListCheckRequestParam() {
        super();
        this.setModelName("blackList");
    }

    @Override
    public BlackList getRequestParam() {
        this.setApplNo("12345");
        BlackList blackList = new BlackList();
        blackList.setId("12");
        return blackList;
    }
}
