package com.citic.action.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

/**
 * BASE_ATTRIBUTE
 *
 * @author
 */
@Data
public class BaseAttribute implements Serializable {
    private Integer attributeId;

    private String attributeName;

    private String attributeChnName;

    private LocalDateTime attributeCreateTime;

    private LocalDateTime attributeLastUpdateTime;

    private static final long serialVersionUID = 1L;
}