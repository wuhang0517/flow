package com.citic.sign.mapper;

import com.citic.sign.model.StdTrxcodeFund;
import com.citic.sign.model.StdTrxcodeFundExample;
import com.citic.sign.model.StdTrxcodeFundKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StdTrxcodeFundDao {
    long countByExample(StdTrxcodeFundExample example);

    int deleteByExample(StdTrxcodeFundExample example);

    int deleteByPrimaryKey(StdTrxcodeFundKey key);

    int insert(StdTrxcodeFund record);

    int insertSelective(StdTrxcodeFund record);

    List<StdTrxcodeFund> selectByExample(StdTrxcodeFundExample example);

    StdTrxcodeFund selectByPrimaryKey(StdTrxcodeFundKey key);

    int updateByExampleSelective(@Param("record") StdTrxcodeFund record, @Param("example") StdTrxcodeFundExample example);

    int updateByExample(@Param("record") StdTrxcodeFund record, @Param("example") StdTrxcodeFundExample example);

    int updateByPrimaryKeySelective(StdTrxcodeFund record);

    int updateByPrimaryKey(StdTrxcodeFund record);
}