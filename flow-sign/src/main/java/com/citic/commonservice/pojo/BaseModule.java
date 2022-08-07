package com.citic.commonservice.pojo;

import lombok.Data;

/**
 * @ClassName BaseModule
 * @Description 基础服务的实体类
 * @Author lin
 * @Date 2022/7/13 下午10:58
 * @Version 1.0
 */
@Data
public class BaseModule {

    //公共服务的id
    private String baseModuleId;

    //客户号
    private String custId;

    //客户标识
    private String applType;
}
