package com.citic.action.controller;

import com.citic.action.pojo.AttrModelRel;
import com.citic.action.service.AttrModelRelService;
import com.citic.base.pojo.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName AttrModelRelController
 * @Description 属性模块关系
 * @Author lin
 * @Date 2020/8/21 12:19
 * @Version 1.0
 */
@RequestMapping("/attrModelRel")
@RestController
public class AttrModelRelController {

    @Autowired
    AttrModelRelService attrModelRelService;

    @GetMapping("/select")
    @ResponseBody
    public ApiResponse selectAttrModel(@RequestParam(value = "modelTypeName") String modelTypeName) {
        AttrModelRel attrModelRel = attrModelRelService.selectByModelTypeName(modelTypeName);
        if (attrModelRel == null) {
            return ApiResponse.fail("-1", "查询失败");
        }
        return ApiResponse.suc("0", attrModelRel);
    }
}
