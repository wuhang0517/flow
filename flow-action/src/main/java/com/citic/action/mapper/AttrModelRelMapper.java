package com.citic.action.mapper;

import com.citic.action.pojo.AttrModelRel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttrModelRelMapper {
    int deleteByPrimaryKey(String attrModelRelId);

    int insert(AttrModelRel record);

    int insertSelective(AttrModelRel record);

    AttrModelRel selectByPrimaryKey(String attrModelRelId);

    int updateByPrimaryKeySelective(AttrModelRel record);

    int updateByPrimaryKey(AttrModelRel record);
}