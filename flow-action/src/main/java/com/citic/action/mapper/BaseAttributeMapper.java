package com.citic.action.mapper;

import com.citic.action.pojo.BaseAttribute;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseAttributeMapper {
    int deleteByPrimaryKey(String attributeId);

    int insert(BaseAttribute record);

    int insertSelective(BaseAttribute record);

    BaseAttribute selectByPrimaryKey(String attributeId);

    int updateByPrimaryKeySelective(BaseAttribute record);

    int updateByPrimaryKey(BaseAttribute record);

    List<BaseAttribute> selectAll();
}