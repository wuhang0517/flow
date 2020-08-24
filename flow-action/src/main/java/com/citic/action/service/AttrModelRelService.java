package com.citic.action.service;

import com.citic.action.mapper.AttrModelRelMapper;
import com.citic.action.pojo.AttrModelRel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AttrModelRelService
 * @Description 属性模式关系的service
 * @Author lin
 * @Date 2020/8/21 12:15
 * @Version 1.0
 */
@Service
public class AttrModelRelService {

    @Autowired
    AttrModelRelMapper attrModelRelMapper;

    public AttrModelRel selectByModelTypeName(String modelTypeName) {
        AttrModelRel attrModelRel = attrModelRelMapper.selectByModelTypeName(modelTypeName);
        return attrModelRel;
    }
}
