package com.citic.oure.service.impl;

import com.citic.action.pojo.TradeAttrRel;
import com.citic.base.pojo.ApiResponse;
import com.citic.oure.pojo.ZxcwOurePojo;
import com.citic.oure.service.BaseActionFuncion;

import java.util.List;

/**
 * @ClassName ZxcwOureAction
 * @Description 中信财务模式的自动汇出汇款
 * @Author lin
 * @Date 2020/12/3 下午11:04
 * @Version 1.0
 */
public class ZxcwOureAction extends BaseActionFuncion<ZxcwOurePojo> {


    public ZxcwOureAction(String autoParam) {
        super(autoParam);
    }

    @Override
    public ZxcwOurePojo xmlToBean(String xml) {
        return null;
    }

    @Override
    public ZxcwOurePojo defaultValueToOureVo(List<TradeAttrRel> tradeAttrRels, ZxcwOurePojo oureVo) {
        return null;
    }

    @Override
    public ApiResponse repeatCheck(ZxcwOurePojo basePojo, String xml) {
        return null;
    }

    @Override
    public ApiResponse receiveRequest(ZxcwOurePojo basePojo) {
        return null;
    }

    @Override
    public ApiResponse<ZxcwOurePojo> prepareAutoData(String prepareParam) {
        //select * from SYS_OURE_INTERFACE where MODEL_TYPE_NAME ='' AND TRADE_TYPE ='ZXCW';
        return null;
    }

    @Override
    public void successAutoFlow(ZxcwOurePojo basePojo) {

    }

    @Override
    public void failAutoFlow(ZxcwOurePojo basePojo) {

    }

    @Override
    public ApiResponse<ZxcwOurePojo> autoFlowCheck(ZxcwOurePojo basePojo) {
        return null;
    }
}
