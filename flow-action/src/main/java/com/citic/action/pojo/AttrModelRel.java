package com.citic.action.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

/**
 * ATTR_MODEL_REL
 *
 * @author
 */
@Data
public class AttrModelRel implements Serializable {
    private Integer attrModelRelId;

    private String modelTypeName;

    private String attributeName;

    private String isCancle;

    private LocalDateTime relationCreateTime;

    private LocalDateTime relationLastUpdateTime;

    private static final long serialVersionUID = 1L;
}