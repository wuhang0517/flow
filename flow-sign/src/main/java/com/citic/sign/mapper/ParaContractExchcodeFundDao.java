package com.citic.sign.mapper;

import com.citic.sign.model.ParaContractExchcodeFund;
import com.citic.sign.model.ParaContractExchcodeFundExample;
import com.citic.sign.model.ParaContractExchcodeFundKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaContractExchcodeFundDao {
    long countByExample(ParaContractExchcodeFundExample example);

    int deleteByExample(ParaContractExchcodeFundExample example);

    int deleteByPrimaryKey(ParaContractExchcodeFundKey key);

    int insert(ParaContractExchcodeFund record);

    int insertSelective(ParaContractExchcodeFund record);

    List<ParaContractExchcodeFund> selectByExample(ParaContractExchcodeFundExample example);

    ParaContractExchcodeFund selectByPrimaryKey(ParaContractExchcodeFundKey key);

    int updateByExampleSelective(@Param("record") ParaContractExchcodeFund record, @Param("example") ParaContractExchcodeFundExample example);

    int updateByExample(@Param("record") ParaContractExchcodeFund record, @Param("example") ParaContractExchcodeFundExample example);

    int updateByPrimaryKeySelective(ParaContractExchcodeFund record);

    int updateByPrimaryKey(ParaContractExchcodeFund record);
}