package com.citic.action.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

/**
 * TRADE_CHECK_MODULE_REL
 *
 * @author
 */
@Data
public class TradeCheckModuleRel implements Serializable {
    /**
     * 唯一主键
     */
    private Integer realtionUniqeId;

    /**
     * 渠道类型
     */
    private String tradeType;

    /**
     * 基础模式id
     */
    private String modelTypeName;

    /**
     * 检查模块的id
     */
    private String checkModuleName;

    /**
     * 检查模块的顺序
     */
    private String checkModuleOrder;

    /**
     * 是否执行检查
     */
    private String isChecked;

    /**
     * 创建时间
     */
    private LocalDateTime relationCreateTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime relationLastUpdateTime;

    private static final long serialVersionUID = 1L;
}