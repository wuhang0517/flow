package com.citic.oure.service;

import com.citic.action.pojo.TradeAttrRel;
import com.citic.action.service.TradeAttrRelService;
import com.citic.base.pojo.ApiResponse;
import com.citic.base.pojo.check.CheckResponse;
import com.citic.base.pojo.oure.BasePojo;
import com.citic.check.CheckManager;

import java.util.List;

/**
 * @ClassName BaseOureFuncion
 * @Description 基础的汇出汇款流程
 * @Author lin
 * @Date 2020/8/21 08:54
 * @Version 1.0
 */
public abstract class BaseActionFuncion<T extends BasePojo> implements ActionFuncInter<T>, ActionRestInter<T> {

    private String autoParam;

    public BaseActionFuncion(String autoParam) {
        this.autoParam = autoParam;
    }

    /**
     * xsd的校验，
     *
     * @param trxCode 交易编码
     * @param xml 报文
     * @return
     */
    public ApiResponse checkOureXml(String trxCode, String xml) {
        return null;
    }

    /**
     * 执行自动化操作
     */
    public void dealData() {
        //获取执行时需要的参数
        ApiResponse<T> response = this.prepareAutoData(this.autoParam);
        if (!response.getRet()) {
            return;
        }
        //获取需要执行的数据
        T basePojo = response.getData();
        //流程执行前的检查
        ApiResponse<List<CheckResponse>> chechResponse = CheckManager.check(basePojo.getApplType(), basePojo.getApplNo(), null);
        if (!chechResponse.getRet()) {
            //检查不通过执行的动作
        }
        try {
            //执行自动化的汇出汇款动作

            //成功执行的动作
            this.successAutoFlow(basePojo);
        } catch (Exception e) {
            this.failAutoFlow(basePojo);
        }
    }

    /**
     * 接收外部请求
     *
     * @param applType 渠道类型
     * @param trxCode 交易码
     * @param xml 报文
     * @return
     */
    public ApiResponse getRequest(String applType, String trxCode, String xml) {
        //xml校验
        ApiResponse response = this.checkOureXml(trxCode, xml);
        if (!response.getRet()) {
            //校验失败
            return ApiResponse.fail("-1", "");
        }
        //xml转为对应的实体
        T basePojo = this.xmlToBean(xml);
        //todo 一些固定值的校验

        //防重校验
        ApiResponse firstCheck = this.repeatCheck(basePojo, xml);
        if (firstCheck.getRet()) {
            //校验失败
            return ApiResponse.fail("-1", "");
        }
        //获取默认的属性值
        List<TradeAttrRel> tradeAttrRels = TradeAttrRelService.selectAttrByTrade(trxCode);
        //将默认值负值到实体，可以新增
        defaultValueToOureVo(tradeAttrRels, basePojo);
        //报文入库
        ApiResponse receiveOureRequest = this.receiveRequest(basePojo);
        //防重校验
        if (receiveOureRequest.getRet()) {
            //校验失败
            return ApiResponse.fail("-1", "");
        }
        //接收成功
        return ApiResponse.suc("", "");
    }

    /**
     * 将xml转换为对应的实体
     *
     * @param xml
     * @return
     */
    public abstract T xmlToBean(String xml) ;

    /**
     * 将签约时的默认值负值给实体类
     *
     * @param tradeAttrRels 默认的属性值
     * @param oureVo 汇出汇款的实体
     * @return
     */
    public abstract T defaultValueToOureVo(List<TradeAttrRel> tradeAttrRels, T oureVo) ;
}
