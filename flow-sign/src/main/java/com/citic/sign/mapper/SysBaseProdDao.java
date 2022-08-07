package com.citic.sign.mapper;

import com.citic.sign.model.SysBaseProd;
import com.citic.sign.model.SysBaseProdExample;
import com.citic.sign.model.SysBaseProdKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBaseProdDao {
    long countByExample(SysBaseProdExample example);

    int deleteByExample(SysBaseProdExample example);

    int deleteByPrimaryKey(SysBaseProdKey key);

    int insert(SysBaseProd record);

    int insertSelective(SysBaseProd record);

    List<SysBaseProd> selectByExample(SysBaseProdExample example);

    SysBaseProd selectByPrimaryKey(SysBaseProdKey key);

    int updateByExampleSelective(@Param("record") SysBaseProd record, @Param("example") SysBaseProdExample example);

    int updateByExample(@Param("record") SysBaseProd record, @Param("example") SysBaseProdExample example);

    int updateByPrimaryKeySelective(SysBaseProd record);

    int updateByPrimaryKey(SysBaseProd record);
}