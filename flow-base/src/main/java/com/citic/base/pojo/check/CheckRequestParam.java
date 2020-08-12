package com.citic.base.pojo.check;

import lombok.Data;

/**
 * @ClassName CheckRequestParam
 * @Description 检查请求的入参基类
 * @Author lin
 * @Date 2020/8/6 23:19
 * @Version 1.0
 */
@Data
public abstract class CheckRequestParam<T> {


    //模块名称
    private String modelName;

    //申请编号
    private String applNo;

    //主流水号
    private String cMainRef;

    public CheckRequestParam() {
    }

    public CheckRequestParam(String modelName) {
        this.setModelName(modelName);
    }

    //获取校验的实体
    public abstract T getRequestParam();

}
