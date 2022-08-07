package com.citic.sign.model;

import lombok.Data;

/**
 * @ClassName SignControInfo
 * @Description 签约的控制信息
 * @Author lin
 * @Date 2021/7/11 下午11:02
 * @Version 1.0
 */
@Data
public class SignControInfo {

    //落地机构
    private String opreUit;

    //接收机构
    private String recvUnit;
}
