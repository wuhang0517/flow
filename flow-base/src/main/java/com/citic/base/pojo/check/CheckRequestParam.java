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
public abstract class CheckRequestParam<T> extends BaseFlowPojo {

    public CheckRequestParam() {
    }

    public CheckRequestParam(String modelName) {
        super.setModelName(modelName);
    }

    //获取校验的实体
    public abstract T getRequestParam();

}
