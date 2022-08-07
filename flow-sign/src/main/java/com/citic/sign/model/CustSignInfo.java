package com.citic.sign.model;

import lombok.Data;

import java.util.List;

/**
 * @ClassName CustSignInfo
 * @Description 客户签约信息
 * @Author lin
 * @Date 2021/11/8 下午11:01
 * @Version 1.0
 */
@Data
public class CustSignInfo {

    private MainInfo mainInfo;

    private List<SignAcct> signAccts;

    private IbpInfo ibpInfo;

    private SignInreInfo signInreInfo;
}
