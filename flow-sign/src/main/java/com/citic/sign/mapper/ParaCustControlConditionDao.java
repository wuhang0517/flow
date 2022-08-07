package com.citic.sign.mapper;

import com.citic.sign.model.ParaCustControlCondition;
import com.citic.sign.model.ParaCustControlConditionExample;
import com.citic.sign.model.ParaCustControlConditionKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaCustControlConditionDao {
    long countByExample(ParaCustControlConditionExample example);

    int deleteByExample(ParaCustControlConditionExample example);

    int deleteByPrimaryKey(ParaCustControlConditionKey key);

    int insert(ParaCustControlCondition record);

    int insertSelective(ParaCustControlCondition record);

    List<ParaCustControlCondition> selectByExample(ParaCustControlConditionExample example);

    ParaCustControlCondition selectByPrimaryKey(ParaCustControlConditionKey key);

    int updateByExampleSelective(@Param("record") ParaCustControlCondition record, @Param("example") ParaCustControlConditionExample example);

    int updateByExample(@Param("record") ParaCustControlCondition record, @Param("example") ParaCustControlConditionExample example);

    int updateByPrimaryKeySelective(ParaCustControlCondition record);

    int updateByPrimaryKey(ParaCustControlCondition record);
}