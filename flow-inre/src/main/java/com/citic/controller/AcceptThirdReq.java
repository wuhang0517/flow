package com.citic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName AcceptThirdReq
 * @Description 接收第三方请求
 * @Author lin
 * @Date 2021/7/5 上午12:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/inre")
public class AcceptThirdReq {


    @PostMapping(value = "/{trxCode}", consumes = "text/plain")
    public String handle500(@PathVariable String trxCode) {
        System.out.println(trxCode);
        return "success;";
    }
}
