package com.citic.action.mapper;

import com.citic.action.pojo.TradeCheckModuleRel;

public interface TradeCheckModuleRelMapper {
    int deleteByPrimaryKey(String realtionUniqeId);

    int insert(TradeCheckModuleRel record);

    int insertSelective(TradeCheckModuleRel record);

    TradeCheckModuleRel selectByPrimaryKey(String realtionUniqeId);

    int updateByPrimaryKeySelective(TradeCheckModuleRel record);

    int updateByPrimaryKey(TradeCheckModuleRel record);
}