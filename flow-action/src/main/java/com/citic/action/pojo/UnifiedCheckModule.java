package com.citic.action.pojo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * UNIFIED_CHECK_MODULE
 *
 * @author
 */
@Data
public class UnifiedCheckModule implements Serializable {
    private Integer checkModuleId;

    private String checkModuleSimpleName;

    private String checkModuleName;

    private String checkModulePath;

    private LocalDateTime checkModuleCreateTime;

    private String checkModuleParamPath;

    private static final long serialVersionUID = 1L;
}