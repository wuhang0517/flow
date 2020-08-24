package com.citic.action.mapper;

import com.citic.action.pojo.TradeCheckModuleRel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TradeCheckModuleRelMapper {
    int deleteByPrimaryKey(String realtionUniqeId);

    int insert(TradeCheckModuleRel record);

    int insertSelective(TradeCheckModuleRel record);

    TradeCheckModuleRel selectByPrimaryKey(String realtionUniqeId);

    int updateByPrimaryKeySelective(TradeCheckModuleRel record);

    int updateByPrimaryKey(TradeCheckModuleRel record);
}