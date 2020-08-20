package com.citic.action.service;

import com.citic.action.mapper.BaseAttributeMapper;
import com.citic.action.pojo.BaseAttribute;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName BaseAttributeService
 * @Description 基础属性的service
 * @Author lin
 * @Date 2020/8/17 21:10
 * @Version 1.0
 */
@Service
public class BaseAttributeService {

    @Resource
    BaseAttributeMapper baseAttributeMapper;

    public int insertBaseAttribute(BaseAttribute baseAttribute) {
        baseAttribute.setAttributeCreateTime(LocalDateTime.now());
        baseAttribute.setAttributeLastUpdateTime(LocalDateTime.now());
        int i = baseAttributeMapper.insert(baseAttribute);
        return i;
    }

    public List<BaseAttribute> selectAll() {
        List<BaseAttribute> baseAttributes = baseAttributeMapper.selectAll();
        return baseAttributes;
    }

    public int delete(String id) {
        int i = baseAttributeMapper.deleteByPrimaryKey(id);
        return i;
    }

}
