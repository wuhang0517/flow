package com.citic.check.pojo;

import lombok.Data;

/**
 * @ClassName CheckModelRel
 * @Description 检查模块的关系实体
 * @Author lin
 * @Date 2020/8/10 15:14
 * @Version 1.0
 */
@Data
public class CheckModelRel {

    //渠道类型
    private String tradeType;

    //检查模块的名称
    private String checkModuleName;

    //检查模块的id
    private String checkModuleId;

    //检查的顺序
    private String checkModuleOrder;

    //检查模块的全路径
    private String checkModulePath;

    //检查模块参数的全路径
    private String checkModuleParamPath;

    //是否执行检查 0:需要。1：不需要
    private Integer isChecked;



}
