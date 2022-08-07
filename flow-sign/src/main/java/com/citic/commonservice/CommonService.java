package com.citic.commonservice;

import com.citic.commonservice.pojo.BaseModule;
import com.citic.commonservice.pojo.ModuleResult;

/**
 * @ClassName CommonService
 * @Description 公共服务的接口
 * @Author lin
 * @Date 2022/7/13 下午10:57
 * @Version 1.0
 */
public interface CommonService<T extends BaseModule,R extends ModuleResult> {

    //服务需要执行的动作。
    R doService(T service);
}
