package com.citic.sign.mapper;

import com.citic.sign.model.ParaCustControl;
import com.citic.sign.model.ParaCustControlExample;
import com.citic.sign.model.ParaCustControlKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaCustControlDao {
    long countByExample(ParaCustControlExample example);

    int deleteByExample(ParaCustControlExample example);

    int deleteByPrimaryKey(ParaCustControlKey key);

    int insert(ParaCustControl record);

    int insertSelective(ParaCustControl record);

    List<ParaCustControl> selectByExample(ParaCustControlExample example);

    ParaCustControl selectByPrimaryKey(ParaCustControlKey key);

    int updateByExampleSelective(@Param("record") ParaCustControl record, @Param("example") ParaCustControlExample example);

    int updateByExample(@Param("record") ParaCustControl record, @Param("example") ParaCustControlExample example);

    int updateByPrimaryKeySelective(ParaCustControl record);

    int updateByPrimaryKey(ParaCustControl record);
}