package com.citic.action.mapper;

import com.citic.action.pojo.TradeAttrRel;

public interface TradeAttrRelMapper {
    int deleteByPrimaryKey(String tradeAttrRelId);

    int insert(TradeAttrRel record);

    int insertSelective(TradeAttrRel record);

    TradeAttrRel selectByPrimaryKey(String tradeAttrRelId);

    int updateByPrimaryKeySelective(TradeAttrRel record);

    int updateByPrimaryKey(TradeAttrRel record);
}