package com.citic.sign.mapper;

import com.citic.sign.model.ParaControlLevel;
import com.citic.sign.model.ParaControlLevelExample;
import com.citic.sign.model.ParaControlLevelKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaControlLevelDao {
    long countByExample(ParaControlLevelExample example);

    int deleteByExample(ParaControlLevelExample example);

    int deleteByPrimaryKey(ParaControlLevelKey key);

    int insert(ParaControlLevel record);

    int insertSelective(ParaControlLevel record);

    List<ParaControlLevel> selectByExample(ParaControlLevelExample example);

    ParaControlLevel selectByPrimaryKey(ParaControlLevelKey key);

    int updateByExampleSelective(@Param("record") ParaControlLevel record, @Param("example") ParaControlLevelExample example);

    int updateByExample(@Param("record") ParaControlLevel record, @Param("example") ParaControlLevelExample example);

    int updateByPrimaryKeySelective(ParaControlLevel record);

    int updateByPrimaryKey(ParaControlLevel record);
}