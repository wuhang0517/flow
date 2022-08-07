package com.citic.sign.mapper;

import com.citic.sign.model.ParaContractIbpOut;
import com.citic.sign.model.ParaContractIbpOutExample;
import com.citic.sign.model.ParaContractIbpOutKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaContractIbpOutDao {
    long countByExample(ParaContractIbpOutExample example);

    int deleteByExample(ParaContractIbpOutExample example);

    int deleteByPrimaryKey(ParaContractIbpOutKey key);

    int insert(ParaContractIbpOut record);

    int insertSelective(ParaContractIbpOut record);

    List<ParaContractIbpOut> selectByExample(ParaContractIbpOutExample example);

    ParaContractIbpOut selectByPrimaryKey(ParaContractIbpOutKey key);

    int updateByExampleSelective(@Param("record") ParaContractIbpOut record, @Param("example") ParaContractIbpOutExample example);

    int updateByExample(@Param("record") ParaContractIbpOut record, @Param("example") ParaContractIbpOutExample example);

    int updateByPrimaryKeySelective(ParaContractIbpOut record);

    int updateByPrimaryKey(ParaContractIbpOut record);
}