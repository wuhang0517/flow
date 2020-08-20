package com.citic.action.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * TRADE_ATTR_REL
 * @author 
 */
@Data
public class TradeAttrRel implements Serializable {
    private Integer tradeAttrRelId;

    private String tradeType;

    private String attributeName;

    private String defaultValue;

    private String errMsg;

    private LocalDateTime relationCreateTime;

    private LocalDateTime relationLastUpdateTime;

    private static final long serialVersionUID = 1L;
}