package com.citic.action.service;

import com.citic.action.pojo.BaseAttribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseAttributeServiceTest {

    @Autowired
    BaseAttributeService baseAttributeService;

    @Test
    public void test() {
        BaseAttribute baseAttribute = new BaseAttribute();
        baseAttribute.setAttributeName("1");
        baseAttribute.setAttributeChnName("2");
        baseAttribute.setAttributeCreateTime(LocalDateTime.now());
        baseAttribute.setAttributeLastUpdateTime(LocalDateTime.now());
        baseAttributeService.insertBaseAttribute(baseAttribute);
    }
}