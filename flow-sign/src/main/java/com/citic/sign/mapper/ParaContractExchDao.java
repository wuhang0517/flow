package com.citic.sign.mapper;

import com.citic.sign.model.ParaContractExchExample;
import com.citic.sign.model.ParaContractExch;
import com.citic.sign.model.ParaContractExchKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaContractExchDao {
    long countByExample(ParaContractExchExample example);

    int deleteByExample(ParaContractExchExample example);

    int deleteByPrimaryKey(ParaContractExchKey key);

    int insert(ParaContractExch record);

    int insertSelective(ParaContractExch record);

    List<ParaContractExch> selectByExample(ParaContractExchExample example);

    ParaContractExch selectByPrimaryKey(ParaContractExchKey key);

    int updateByExampleSelective(@Param("record") ParaContractExch record, @Param("example") ParaContractExchExample example);

    int updateByExample(@Param("record") ParaContractExch record, @Param("example") ParaContractExchExample example);

    int updateByPrimaryKeySelective(ParaContractExch record);

    int updateByPrimaryKey(ParaContractExch record);
}