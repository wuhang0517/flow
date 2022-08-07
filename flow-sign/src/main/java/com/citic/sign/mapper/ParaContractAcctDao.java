package com.citic.sign.mapper;

import com.citic.sign.model.ParaContractAcct;
import com.citic.sign.model.ParaContractAcctExample;
import com.citic.sign.model.ParaContractAcctKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaContractAcctDao {
    long countByExample(ParaContractAcctExample example);

    int deleteByExample(ParaContractAcctExample example);

    int deleteByPrimaryKey(ParaContractAcctKey key);

    int insert(ParaContractAcct record);

    int insertSelective(ParaContractAcct record);

    List<ParaContractAcct> selectByExample(ParaContractAcctExample example);

    ParaContractAcct selectByPrimaryKey(ParaContractAcctKey key);

    int updateByExampleSelective(@Param("record") ParaContractAcct record, @Param("example") ParaContractAcctExample example);

    int updateByExample(@Param("record") ParaContractAcct record, @Param("example") ParaContractAcctExample example);

    int updateByPrimaryKeySelective(ParaContractAcct record);

    int updateByPrimaryKey(ParaContractAcct record);
}