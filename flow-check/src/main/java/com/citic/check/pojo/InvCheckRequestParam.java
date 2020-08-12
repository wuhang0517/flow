package com.citic.check.pojo;

import com.citic.base.pojo.check.CheckRequestParam;

/**
 * @ClassName InvCheckRequestParam
 * @Description 发票查验需要的参数
 * @Author lin
 * @Date 2020/8/6 23:27
 * @Version 1.0
 */
public class InvCheckRequestParam extends CheckRequestParam<InvPojo> {

    public InvCheckRequestParam() {
        super();
        this.setModelName("inv");
    }

    @Override
    public InvPojo getRequestParam() {
        //todo 获取需要检查的实体

        return getInv(this.getApplNo());
    }

    private InvPojo getInv(String applNo) {
        super.setApplNo(applNo);
        InvPojo invPojo = new InvPojo();
        invPojo.setInvNo(applNo);
        return invPojo;
    }
}
