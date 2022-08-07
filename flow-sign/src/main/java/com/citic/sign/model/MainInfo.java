package com.citic.sign.model;

import lombok.Data;

/**
 * @ClassName MainInfo
 * @Description 签约主体信息
 * @Author lin
 * @Date 2021/11/8 下午10:53
 * @Version 1.0
 */
@Data
public class MainInfo {

    private String cMainRef;

    private String custId;

    private String unidCode;

    private String fundType;

    //处理方式
    private String dealType;
}
