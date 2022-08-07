package com.citic.sign.mapper;

import com.citic.sign.model.ParaExchcodeFundRel;
import com.citic.sign.model.ParaExchcodeFundRelExample;
import com.citic.sign.model.ParaExchcodeFundRelKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaExchcodeFundRelDao {
    long countByExample(ParaExchcodeFundRelExample example);

    int deleteByExample(ParaExchcodeFundRelExample example);

    int deleteByPrimaryKey(ParaExchcodeFundRelKey key);

    int insert(ParaExchcodeFundRel record);

    int insertSelective(ParaExchcodeFundRel record);

    List<ParaExchcodeFundRel> selectByExample(ParaExchcodeFundRelExample example);

    ParaExchcodeFundRel selectByPrimaryKey(ParaExchcodeFundRelKey key);

    int updateByExampleSelective(@Param("record") ParaExchcodeFundRel record, @Param("example") ParaExchcodeFundRelExample example);

    int updateByExample(@Param("record") ParaExchcodeFundRel record, @Param("example") ParaExchcodeFundRelExample example);

    int updateByPrimaryKeySelective(ParaExchcodeFundRel record);

    int updateByPrimaryKey(ParaExchcodeFundRel record);
}