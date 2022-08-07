package com.citic.sign.mapper;

import com.citic.sign.model.ParaSignContractOnline;
import com.citic.sign.model.ParaSignContractOnlineExample;
import com.citic.sign.model.ParaSignContractOnlineKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaSignContractOnlineDao {
    long countByExample(ParaSignContractOnlineExample example);

    int deleteByExample(ParaSignContractOnlineExample example);

    int deleteByPrimaryKey(ParaSignContractOnlineKey key);

    int insert(ParaSignContractOnline record);

    int insertSelective(ParaSignContractOnline record);

    List<ParaSignContractOnline> selectByExample(ParaSignContractOnlineExample example);

    ParaSignContractOnline selectByPrimaryKey(ParaSignContractOnlineKey key);

    int updateByExampleSelective(@Param("record") ParaSignContractOnline record, @Param("example") ParaSignContractOnlineExample example);

    int updateByExample(@Param("record") ParaSignContractOnline record, @Param("example") ParaSignContractOnlineExample example);

    int updateByPrimaryKeySelective(ParaSignContractOnline record);

    int updateByPrimaryKey(ParaSignContractOnline record);
}