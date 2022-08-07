package com.citic.sign.mapper;

import com.citic.sign.model.SysInchanType;
import com.citic.sign.model.SysInchanTypeExample;
import com.citic.sign.model.SysInchanTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysInchanTypeDao {
    long countByExample(SysInchanTypeExample example);

    int deleteByExample(SysInchanTypeExample example);

    int deleteByPrimaryKey(SysInchanTypeKey key);

    int insert(SysInchanType record);

    int insertSelective(SysInchanType record);

    List<SysInchanType> selectByExample(SysInchanTypeExample example);

    SysInchanType selectByPrimaryKey(SysInchanTypeKey key);

    int updateByExampleSelective(@Param("record") SysInchanType record, @Param("example") SysInchanTypeExample example);

    int updateByExample(@Param("record") SysInchanType record, @Param("example") SysInchanTypeExample example);

    int updateByPrimaryKeySelective(SysInchanType record);

    int updateByPrimaryKey(SysInchanType record);
}