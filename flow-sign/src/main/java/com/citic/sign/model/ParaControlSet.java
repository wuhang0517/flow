package com.citic.sign.model;

import lombok.Data;

/**
 * @ClassName ParaControlSet
 * @Description 参数控制表
 * @Author lin
 * @Date 2021/11/8 下午10:20
 * @Version 1.0
 */
@Data
public class ParaControlSet {

    //参数id
    private String paraId;

    //参数值
    private String paraValue;

    //参数值类型 Y 表示原始值 B 表示控制的值
    private String paraValueType;

    //参数控制的值集合
    private String paraControlValue;
}
