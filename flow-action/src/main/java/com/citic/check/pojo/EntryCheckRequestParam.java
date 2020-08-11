package com.citic.check.pojo;

import com.citic.base.pojo.check.CheckRequestParam;

/**
 * @ClassName InvCheckRequestParam
 * @Description 发票查验需要的参数
 * @Author lin
 * @Date 2020/8/6 23:27
 * @Version 1.0
 */
public class EntryCheckRequestParam extends CheckRequestParam<Entry> {

    public EntryCheckRequestParam() {
        super();
        this.setModelName("entry");
    }

    @Override
    public Entry getRequestParam() {
        //todo 获取需要检查的实体

        return getEntry(this.getApplNo());
    }

    private Entry getEntry(String applNo) {
        super.setApplNo(applNo);
        Entry entry = new Entry();
        entry.setEntryId("123456");
        return entry;
    }
}
