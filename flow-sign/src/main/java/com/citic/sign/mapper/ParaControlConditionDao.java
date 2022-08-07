package com.citic.sign.mapper;

import com.citic.sign.model.ParaControlCondition;
import com.citic.sign.model.ParaControlConditionExample;
import com.citic.sign.model.ParaControlConditionKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaControlConditionDao {
    long countByExample(ParaControlConditionExample example);

    int deleteByExample(ParaControlConditionExample example);

    int deleteByPrimaryKey(ParaControlConditionKey key);

    int insert(ParaControlCondition record);

    int insertSelective(ParaControlCondition record);

    List<ParaControlCondition> selectByExample(ParaControlConditionExample example);

    ParaControlCondition selectByPrimaryKey(ParaControlConditionKey key);

    int updateByExampleSelective(@Param("record") ParaControlCondition record, @Param("example") ParaControlConditionExample example);

    int updateByExample(@Param("record") ParaControlCondition record, @Param("example") ParaControlConditionExample example);

    int updateByPrimaryKeySelective(ParaControlCondition record);

    int updateByPrimaryKey(ParaControlCondition record);
}