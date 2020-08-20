package com.citic.action.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ModelAttrRel
 * @Description
 * @Author lin
 * @Date 2020/8/19 20:58
 * @Version 1.0
 */
@Data
public class ModelAttrRel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String modelTypeName;

    private String modelTypeChnName;

    private String modelFunctionId;

    private String modelFunctionName;

    private String attributeNames;
}
