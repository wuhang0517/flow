package com.citic.sign.mapper;

import com.citic.sign.model.TransCode;
import com.citic.sign.model.TransCodeExample;
import com.citic.sign.model.TransCodeKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransCodeDao {
    long countByExample(TransCodeExample example);

    int deleteByExample(TransCodeExample example);

    int deleteByPrimaryKey(TransCodeKey key);

    int insert(TransCode record);

    int insertSelective(TransCode record);

    List<TransCode> selectByExample(TransCodeExample example);

    TransCode selectByPrimaryKey(TransCodeKey key);

    int updateByExampleSelective(@Param("record") TransCode record, @Param("example") TransCodeExample example);

    int updateByExample(@Param("record") TransCode record, @Param("example") TransCodeExample example);

    int updateByPrimaryKeySelective(TransCode record);

    int updateByPrimaryKey(TransCode record);
}