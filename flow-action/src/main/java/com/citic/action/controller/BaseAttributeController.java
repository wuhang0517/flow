package com.citic.action.controller;

import com.citic.action.pojo.BaseAttribute;
import com.citic.action.service.BaseAttributeService;
import com.citic.base.pojo.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName BaseAttributeController
 * @Description
 * @Author lin
 * @Date 2020/8/17 21:30
 * @Version 1.0
 */
@RequestMapping("/baseAttribute")
@RestController
public class BaseAttributeController {

    @Autowired
    BaseAttributeService baseAttributeService;

    @PostMapping("/insert")
    @ResponseBody
    public ApiResponse insert(@RequestBody BaseAttribute baseAttribute) {
        int i = baseAttributeService.insertBaseAttribute(baseAttribute);
        if (i == 1) {
            return ApiResponse.suc("0", null);
        }
        return ApiResponse.fail("-1", "操作失败");
    }

    @GetMapping("/selectAll")
    @ResponseBody
    public ApiResponse<List<BaseAttribute>> selectBaseAttr() {
        List<BaseAttribute> baseAttributes = baseAttributeService.selectAll();
        if (CollectionUtils.isEmpty(baseAttributes)) {
            return ApiResponse.fail("-1", null);
        }
        return ApiResponse.suc("0", baseAttributes);
    }

    @GetMapping("/delete")
    @ResponseBody
    public ApiResponse deleteBaseAttr(@RequestParam(value = "id") String id) {
        int i = baseAttributeService.delete(id);
        if (i == 1) {
            return ApiResponse.suc("0", null);
        }
        return ApiResponse.fail("-1", "操作失败");
    }

    @PostMapping("/update")
    @ResponseBody
    public ApiResponse update(@RequestBody BaseAttribute baseAttribute) {
        int i = baseAttributeService.update(baseAttribute);
        if (i == 1) {
            return ApiResponse.suc("0", null);
        }
        return ApiResponse.fail("-1", "操作失败");
    }
}
