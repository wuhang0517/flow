package com.citic.oure.service;

import com.citic.base.pojo.ApiResponse;
import com.citic.base.pojo.oure.BasePojo;

/**
 * @ClassName OureRestInter
 * @Description 汇出汇款对外暴露的接口
 * @Author lin
 * @Date 2020/8/21 08:53
 * @Version 1.0
 */
public interface ActionRestInter<T extends BasePojo> {

    //查询
    //

    /**
     * 自动化流程中的校验
     *
     * @param basePojo
     * @return
     */
    ApiResponse<T> autoFlowCheck(T basePojo);

}
