package com.citic.action.controller;

import com.citic.action.pojo.BaseModelType;
import com.citic.action.service.AttrModelRelService;
import com.citic.action.service.BaseModelTypeService;
import com.citic.action.vo.ModelAttrRel;
import com.citic.base.pojo.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName BaseModelController
 * @Description
 * @Author lin
 * @Date 2020/8/19 19:32
 * @Version 1.0
 */
@RequestMapping("/baseModel")
@RestController
public class BaseModelController {

    @Autowired
    BaseModelTypeService baseModelTypeService;

    @Autowired
    AttrModelRelService attrModelRelService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public ApiResponse selectAll() {
        List<BaseModelType> baseModelTypes = baseModelTypeService.selectAll();
        if (CollectionUtils.isEmpty(baseModelTypes)) {
            return ApiResponse.fail("-1", null);
        }
        return ApiResponse.suc("0", baseModelTypes);
    }


    @PostMapping("/insert")
    @ResponseBody
    public ApiResponse insert(@RequestBody ModelAttrRel modelAttrRel) {
        int i = baseModelTypeService.insert(modelAttrRel);
        if (i == 1) {
            return ApiResponse.suc("0", null);
        }
        return ApiResponse.fail("-1", "操作失败");
    }

    @GetMapping("/delete")
    @ResponseBody
    public ApiResponse deleteBaseAttr(@RequestParam(value = "modelTypeName") String modelTypeName) {
        int i = baseModelTypeService.delete(modelTypeName);
        if (i == 1) {
            return ApiResponse.suc("0", null);
        }
        return ApiResponse.fail("-1", "操作失败");
    }

}
