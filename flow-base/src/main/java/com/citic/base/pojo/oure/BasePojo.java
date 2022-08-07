package com.citic.base.pojo.oure;

import lombok.Data;

/**
 * @ClassName SysOureVo
 * @Description 汇出汇款的实体类
 * @Author lin
 * @Date 2020/8/21 08:34
 * @Version 1.0
 */
@Data
public class BasePojo {

    //申请编号
    private String applNo;

    //交易编码
    private String trxCode;

    //渠道类型
    private String applType;

}
