package com.citic.sign.mapper;

import com.citic.sign.model.ParaContractLtd;
import com.citic.sign.model.ParaContractLtdExample;
import com.citic.sign.model.ParaContractLtdKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaContractLtdDao {
    long countByExample(ParaContractLtdExample example);

    int deleteByExample(ParaContractLtdExample example);

    int deleteByPrimaryKey(ParaContractLtdKey key);

    int insert(ParaContractLtd record);

    int insertSelective(ParaContractLtd record);

    List<ParaContractLtd> selectByExample(ParaContractLtdExample example);

    ParaContractLtd selectByPrimaryKey(ParaContractLtdKey key);

    int updateByExampleSelective(@Param("record") ParaContractLtd record, @Param("example") ParaContractLtdExample example);

    int updateByExample(@Param("record") ParaContractLtd record, @Param("example") ParaContractLtdExample example);

    int updateByPrimaryKeySelective(ParaContractLtd record);

    int updateByPrimaryKey(ParaContractLtd record);
}