package com.citic.oure;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestMain
 * @Description
 * @Author lin
 * @Date 2020/12/10 上午1:29
 * @Version 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        String a = "a";
        Map<String, Object> map = new HashMap<>();
        map.put("a", "a");

        System.out.println(a.equals(map.get("a")));
    }

    /**
     * 接收外部请求流程
     *
     * @param applType 渠道类型
     * @param applNo 申请编号
     * @param xml 报文xml
     */
    public void getRequest(String applType, String applNo, String xml) {
        /**
         * 1. 区分渠道，从外联平台过来的报文，需要校验报文格式。从网银或者银企直联过来的，不需要校验。
         * 2. 按报文类型区分，即按报文编号区分，每一种报文编号新建一个实体类，使用工厂模式
         * 3. 对于不同的报文编号，有相同的动作，可以对这些动作进行合并，提取公共方法
         * 4. 对报文按种类区分。有业务流程的一类，查询的一类（不需要入库）。
         */

    }




}
