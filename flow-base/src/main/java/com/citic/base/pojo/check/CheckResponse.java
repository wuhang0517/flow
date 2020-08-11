package com.citic.base.pojo.check;

import lombok.Data;

/**
 * @ClassName CheckResponse
 * @Description 查验的结果
 * @Author lin
 * @Date 2020/8/6 23:14
 * @Version 1.0
 */
@Data
public class CheckResponse extends BaseFlowPojo {

    //检查结果
    private boolean ret;

    //检查结果状态码
    private String resultCode;

    //检查的结果
    private String checkResult;

    public CheckResponse() {
        super();
    }
}
