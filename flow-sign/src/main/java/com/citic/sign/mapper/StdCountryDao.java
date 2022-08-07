package com.citic.sign.mapper;

import com.citic.sign.model.StdCountry;
import com.citic.sign.model.StdCountryExample;
import com.citic.sign.model.StdCountryKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StdCountryDao {
    long countByExample(StdCountryExample example);

    int deleteByExample(StdCountryExample example);

    int deleteByPrimaryKey(StdCountryKey key);

    int insert(StdCountry record);

    int insertSelective(StdCountry record);

    List<StdCountry> selectByExample(StdCountryExample example);

    StdCountry selectByPrimaryKey(StdCountryKey key);

    int updateByExampleSelective(@Param("record") StdCountry record, @Param("example") StdCountryExample example);

    int updateByExample(@Param("record") StdCountry record, @Param("example") StdCountryExample example);

    int updateByPrimaryKeySelective(StdCountry record);

    int updateByPrimaryKey(StdCountry record);
}