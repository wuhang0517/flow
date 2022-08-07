package com.citic.sign.model;

import lombok.Data;

/**
 * @ClassName SignInreInfo
 * @Description 签约汇入信息
 * @Author lin
 * @Date 2021/11/8 下午10:59
 * @Version 1.0
 */
@Data
public class SignInreInfo {

    private String cMainRef;

    //收单行
    private String recvUnit;
}
