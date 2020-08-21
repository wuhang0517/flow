package com.citic.action.mapper;

import com.citic.action.pojo.BaseModelType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseModelTypeMapper {
    int deleteByPrimaryKey(String modelTypeId);

    int insert(BaseModelType record);

    int insertSelective(BaseModelType record);

    BaseModelType selectByPrimaryKey(String modelTypeId);

    int updateByPrimaryKeySelective(BaseModelType record);

    int updateByPrimaryKey(BaseModelType record);

    List<BaseModelType> selectAll();

    int deleteByModelTypeName(String modelTypeName);
}