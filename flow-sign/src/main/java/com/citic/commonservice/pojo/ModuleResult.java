package com.citic.commonservice.pojo;

import lombok.Data;

/**
 * @ClassName ModuleResult
 * @Description 模块服务执行的结果
 * @Author lin
 * @Date 2022/7/17 下午4:59
 * @Version 1.0
 */
@Data
public class ModuleResult {

    //客户号
    private String custId;

    //执行是否成功
    private Boolean res;


}
