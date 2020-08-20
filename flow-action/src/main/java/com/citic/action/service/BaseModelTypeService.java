package com.citic.action.service;

import com.citic.action.mapper.AttrModelRelMapper;
import com.citic.action.mapper.BaseModelTypeMapper;
import com.citic.action.pojo.AttrModelRel;
import com.citic.action.pojo.BaseModelType;
import com.citic.action.vo.ModelAttrRel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BaseModuleService
 * @Description
 * @Author lin
 * @Date 2020/8/19 19:19
 * @Version 1.0
 */
@Service
public class BaseModelTypeService {

    @Autowired
    BaseModelTypeMapper baseModelTypeMapper;

    @Autowired
    AttrModelRelMapper attrModelRelMapper;

    public List<BaseModelType> selectAll() {
        baseModelTypeMapper.selectAll();
        return baseModelTypeMapper.selectAll();
    }

    @Transactional
    public int insert(ModelAttrRel modelAttrRel) {
        BaseModelType baseModelType = new BaseModelType();
        baseModelType.setModelTypeName(modelAttrRel.getModelTypeName());
        baseModelType.setModelTypeChnName(modelAttrRel.getModelTypeChnName());
        baseModelType.setModelFunctionId(modelAttrRel.getModelFunctionId());
        baseModelType.setModelFunctionName(modelAttrRel.getModelFunctionName());
        AttrModelRel attrModelRel = new AttrModelRel();
        attrModelRel.setModelTypeName(modelAttrRel.getModelTypeName());
        attrModelRel.setAttributeName(modelAttrRel.getAttributeNames());
        int i = attrModelRelMapper.insert(attrModelRel);
        int y = baseModelTypeMapper.insert(baseModelType);
        if (i == 1 && y == 1) {
            return 1;
        }
        return 0;
    }
}
