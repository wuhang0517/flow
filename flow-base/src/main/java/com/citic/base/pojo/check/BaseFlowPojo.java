package com.citic.base.pojo.check;

import lombok.Data;

/**
 * @ClassName BaseFlowPojo
 * @Description 基础流转信息的基类
 * @Author lin
 * @Date 2020/8/10 20:57
 * @Version 1.0
 */
@Data
public class BaseFlowPojo {

    //模块名称
    private String modelName;

    //申请编号
    private String applNo;

    //主流水号
    private String cMainRef;
}
