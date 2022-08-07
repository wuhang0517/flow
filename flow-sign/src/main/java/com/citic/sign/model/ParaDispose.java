package com.citic.sign.model;

import lombok.Data;

/**
 * @ClassName ParaDispost
 * @Description 参数配置表
 * @Author lin
 * @Date 2021/11/8 下午10:13
 * @Version 1.0
 */
@Data
public class ParaDispose {

    //参数id
    private String paraId;
    //参数名称
    private String paraNm;
    //参数所在表名
    private String paraTable;
    //参数所在的列
    private String paraColumn;
    //是否存在上下级关系
    private String isLevel;
    //父级参数所在的列名
    private String paraParentColumn;
    //参数的类型 K 表示控制参数 B 被控制参数 A 二者皆可
    private String paraType;
    //参数控制条件
    private String controlCondition;
}
