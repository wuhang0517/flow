package com.citic.base.pojo;

import lombok.Data;

/**
 * @ClassName ApiResponse
 * @Description 统一返回
 * @Author lin
 * @Date 2020/8/5 22:35
 * @Version 1.0
 */
@Data
public class ApiResponse<T> {

    private Boolean ret;

    private String code;

    private String msg;

    private T data;

    private ApiResponse() {

    }

    public ApiResponse(Boolean ret, String code, String msg, T data) {
        this.ret = ret;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ApiResponse fail(String code, String msg) {
        return new ApiResponse(false, code, msg, null);
    }

    public static <T> ApiResponse fail(String code, T data) {
        return new ApiResponse(false, code, null, data);
    }

    public static <T> ApiResponse fail(String code, String msg, T data) {
        return new ApiResponse(false, code, msg, data);
    }

    public static <T> ApiResponse suc(String code, T data) {
        return new ApiResponse(true, code, null, data);
    }

}
