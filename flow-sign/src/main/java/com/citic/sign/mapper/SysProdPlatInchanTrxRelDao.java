package com.citic.sign.mapper;

import com.citic.sign.model.SysProdPlatInchanTrxRel;
import com.citic.sign.model.SysProdPlatInchanTrxRelExample;
import com.citic.sign.model.SysProdPlatInchanTrxRelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProdPlatInchanTrxRelDao {
    long countByExample(SysProdPlatInchanTrxRelExample example);

    int deleteByExample(SysProdPlatInchanTrxRelExample example);

    int deleteByPrimaryKey(SysProdPlatInchanTrxRelKey key);

    int insert(SysProdPlatInchanTrxRel record);

    int insertSelective(SysProdPlatInchanTrxRel record);

    List<SysProdPlatInchanTrxRel> selectByExample(SysProdPlatInchanTrxRelExample example);

    SysProdPlatInchanTrxRel selectByPrimaryKey(SysProdPlatInchanTrxRelKey key);

    int updateByExampleSelective(@Param("record") SysProdPlatInchanTrxRel record, @Param("example") SysProdPlatInchanTrxRelExample example);

    int updateByExample(@Param("record") SysProdPlatInchanTrxRel record, @Param("example") SysProdPlatInchanTrxRelExample example);

    int updateByPrimaryKeySelective(SysProdPlatInchanTrxRel record);

    int updateByPrimaryKey(SysProdPlatInchanTrxRel record);
}