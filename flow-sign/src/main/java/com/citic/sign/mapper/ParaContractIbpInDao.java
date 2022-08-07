package com.citic.sign.mapper;

import com.citic.sign.model.ParaContractIbpIn;
import com.citic.sign.model.ParaContractIbpInExample;
import com.citic.sign.model.ParaContractIbpInKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaContractIbpInDao {
    long countByExample(ParaContractIbpInExample example);

    int deleteByExample(ParaContractIbpInExample example);

    int deleteByPrimaryKey(ParaContractIbpInKey key);

    int insert(ParaContractIbpIn record);

    int insertSelective(ParaContractIbpIn record);

    List<ParaContractIbpIn> selectByExample(ParaContractIbpInExample example);

    ParaContractIbpIn selectByPrimaryKey(ParaContractIbpInKey key);

    int updateByExampleSelective(@Param("record") ParaContractIbpIn record, @Param("example") ParaContractIbpInExample example);

    int updateByExample(@Param("record") ParaContractIbpIn record, @Param("example") ParaContractIbpInExample example);

    int updateByPrimaryKeySelective(ParaContractIbpIn record);

    int updateByPrimaryKey(ParaContractIbpIn record);
}