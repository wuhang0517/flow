package com.citic.action.mapper;

import com.citic.action.pojo.UnifiedCheckModule;

public interface UnifiedCheckModuleMapper {
    int deleteByPrimaryKey(Integer checkModuleId);

    int insert(UnifiedCheckModule record);

    int insertSelective(UnifiedCheckModule record);

    UnifiedCheckModule selectByPrimaryKey(Integer checkModuleId);

    int updateByPrimaryKeySelective(UnifiedCheckModule record);

    int updateByPrimaryKey(UnifiedCheckModule record);
}