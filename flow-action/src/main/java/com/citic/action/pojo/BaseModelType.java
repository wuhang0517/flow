package com.citic.action.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * BASE_MODEL_TYPE
 * @author 
 */
@Data
public class BaseModelType implements Serializable {
    private Integer modelTypeId;

    private String modelTypeName;

    private String modelTypeChnName;

    private String modelFunctionId;

    private String modelFunctionName;

    private LocalDateTime modelCreateTime;

    private LocalDateTime modelLastUpdateTime;

    private static final long serialVersionUID = 1L;
}