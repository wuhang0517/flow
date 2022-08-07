package com.citic.sign.service;

import com.citic.sign.model.CustSignInfo;
import com.citic.sign.model.MainInfo;
import com.citic.sign.model.ParaDispose;
import com.citic.sign.model.SignAcct;

import java.util.Optional;

/**
 * @ClassName ParaControlService
 * @Description 参数控制的service
 * @Author lin
 * @Date 2021/11/8 下午10:24
 * @Version 1.0
 */
public class ParaControlService {

    public void paraControl(String signInfo) throws Exception {
        //1. 将json
        CustSignInfo custSignInfo = new CustSignInfo();
        //获取主体信息
//        MainInfo mainInfo = custSignInfo.getMainInfo();
//
//        String dealType = "";
//
//        String columnName = "DEAL_TYPE";
//
//        String selectSql = "SELECT * FROM PARA_DISPOSE WHERE PARA_ID = 'DEAL_TYPE' ";
//
//        ParaDispose paraDispose = new ParaDispose();
//
//        //获取控制条件
//        String controlCondition = "UNIT&PROD_PLAT_INCHAN_REL_ID";
//        String controlConditionValue = "711101&YNL";
//        //取到了控制的值
//        String controlSql = "SELECT * FROM PARA_CONTROL WHERE PARA_ID='DEAL' AND PARA_VALUE_TYPE ='T' ";
//
//        String unitCode = "711101";
//
//        String applType = "YNL";
//
//        String[] controlConditions = controlCondition.split("&");
//
//        String[] controlConditionValues = controlConditionValue.split("&");

//        controlCondition.indexOf()
        Optional<CustSignInfo> optionalCustSignInfo = Optional.ofNullable(custSignInfo);
        optionalCustSignInfo.map(CustSignInfo::getMainInfo).orElseThrow(() -> new Exception("主体信息不存在"));
    }

    public static void main(String[] args) throws Exception {
        CustSignInfo custSignInfo = new CustSignInfo();

        Optional<CustSignInfo> optionalCustSignInfo = Optional.ofNullable(custSignInfo);
//        MainInfo mainInfo = optionalCustSignInfo.map(CustSignInfo::getMainInfo).orElseThrow(() -> new Exception("主体信息不存在"));
        SignAcct signAcct = optionalCustSignInfo.map(CustSignInfo::getSignAccts).orElseThrow(() -> new Exception("签约账号信息不存在")).get(0);

    }
}
