package com.citic.sign.mapper;

import com.citic.sign.model.ParaControl;
import com.citic.sign.model.ParaControlExample;
import com.citic.sign.model.ParaControlKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaControlDao {
    long countByExample(ParaControlExample example);

    int deleteByExample(ParaControlExample example);

    int deleteByPrimaryKey(ParaControlKey key);

    int insert(ParaControl record);

    int insertSelective(ParaControl record);

    List<ParaControl> selectByExample(ParaControlExample example);

    ParaControl selectByPrimaryKey(ParaControlKey key);

    int updateByExampleSelective(@Param("record") ParaControl record, @Param("example") ParaControlExample example);

    int updateByExample(@Param("record") ParaControl record, @Param("example") ParaControlExample example);

    int updateByPrimaryKeySelective(ParaControl record);

    int updateByPrimaryKey(ParaControl record);
}