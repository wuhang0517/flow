package com.citic.oure.service;

import com.citic.base.pojo.ApiResponse;
import com.citic.base.pojo.oure.BasePojo;

/**
 * @ClassName ActionFuncInter
 * @Description 通用的功能接口
 * @Author lin
 * @Date 2020/8/21 08:35
 * @Version 1.0
 */
public interface ActionFuncInter<T extends BasePojo> {

    /**
     * 不同渠道的个性话校验，主要针对防重校验
     *
     * @param basePojo 校验接收到的报文实体类
     * @param xml 报文
     * @return
     */
    ApiResponse repeatCheck(T basePojo, String xml);

    /**
     * 接收外部请求，落库操作
     *
     * @param basePojo
     * @return
     */
    ApiResponse receiveRequest(T basePojo);

    /**
     * 准备自动化流程的数据
     *
     * @param prepareParam 自动话流程需要的参数
     * @return
     */
    ApiResponse<T> prepareAutoData(String prepareParam);


    /**
     * 自动化流程成功后执行的动作
     *
     * @param basePojo
     */
    void successAutoFlow(T basePojo);

    /**
     * 自动话流程失败后执行的动作
     *
     * @param basePojo
     */
    void failAutoFlow(T basePojo);
}
