package com.citic.sign.mapper;

import com.citic.sign.model.SysPlatType;
import com.citic.sign.model.SysPlatTypeExample;
import com.citic.sign.model.SysPlatTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPlatTypeDao {
    long countByExample(SysPlatTypeExample example);

    int deleteByExample(SysPlatTypeExample example);

    int deleteByPrimaryKey(SysPlatTypeKey key);

    int insert(SysPlatType record);

    int insertSelective(SysPlatType record);

    List<SysPlatType> selectByExample(SysPlatTypeExample example);

    SysPlatType selectByPrimaryKey(SysPlatTypeKey key);

    int updateByExampleSelective(@Param("record") SysPlatType record, @Param("example") SysPlatTypeExample example);

    int updateByExample(@Param("record") SysPlatType record, @Param("example") SysPlatTypeExample example);

    int updateByPrimaryKeySelective(SysPlatType record);

    int updateByPrimaryKey(SysPlatType record);
}