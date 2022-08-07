package com.citic.sign.mapper;

import com.citic.sign.model.SysPlatInchanRel;
import com.citic.sign.model.SysPlatInchanRelExample;
import com.citic.sign.model.SysPlatInchanRelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPlatInchanRelDao {
    long countByExample(SysPlatInchanRelExample example);

    int deleteByExample(SysPlatInchanRelExample example);

    int deleteByPrimaryKey(SysPlatInchanRelKey key);

    int insert(SysPlatInchanRel record);

    int insertSelective(SysPlatInchanRel record);

    List<SysPlatInchanRel> selectByExample(SysPlatInchanRelExample example);

    SysPlatInchanRel selectByPrimaryKey(SysPlatInchanRelKey key);

    int updateByExampleSelective(@Param("record") SysPlatInchanRel record, @Param("example") SysPlatInchanRelExample example);

    int updateByExample(@Param("record") SysPlatInchanRel record, @Param("example") SysPlatInchanRelExample example);

    int updateByPrimaryKeySelective(SysPlatInchanRel record);

    int updateByPrimaryKey(SysPlatInchanRel record);
}