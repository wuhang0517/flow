package com.citic.sign.mapper;

import com.citic.sign.model.ParaTrxcodeFundIbp;
import com.citic.sign.model.ParaTrxcodeFundIbpExample;
import com.citic.sign.model.ParaTrxcodeFundIbpKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParaTrxcodeFundIbpDao {
    long countByExample(ParaTrxcodeFundIbpExample example);

    int deleteByExample(ParaTrxcodeFundIbpExample example);

    int deleteByPrimaryKey(ParaTrxcodeFundIbpKey key);

    int insert(ParaTrxcodeFundIbp record);

    int insertSelective(ParaTrxcodeFundIbp record);

    List<ParaTrxcodeFundIbp> selectByExample(ParaTrxcodeFundIbpExample example);

    ParaTrxcodeFundIbp selectByPrimaryKey(ParaTrxcodeFundIbpKey key);

    int updateByExampleSelective(@Param("record") ParaTrxcodeFundIbp record, @Param("example") ParaTrxcodeFundIbpExample example);

    int updateByExample(@Param("record") ParaTrxcodeFundIbp record, @Param("example") ParaTrxcodeFundIbpExample example);

    int updateByPrimaryKeySelective(ParaTrxcodeFundIbp record);

    int updateByPrimaryKey(ParaTrxcodeFundIbp record);
}