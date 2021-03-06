package com.citic.check;


import com.citic.base.pojo.ApiResponse;
import com.citic.base.pojo.check.CheckResponse;
import com.citic.check.mapper.CheckModelRelMapper;
import com.citic.check.pojo.CheckModelRel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CheckManagerTest {

    @Autowired
    CheckManager checkManager;

    @Autowired
    CheckModelRelMapper checkModelRelMapper;


    @Test
    public void check() throws Exception {
        ApiResponse<List<CheckResponse>> ezshp = checkManager.check("ezshp", "12345", "");
        System.out.println(ezshp.toString());
    }

    @Test
    public void select() {
        List<CheckModelRel> ezshp = checkModelRelMapper.selectCheckModelByTradetype("ezshp");
        System.out.println(ezshp);
    }

    @Test
    public void test() {
        String s = "1234.00";
        String s1 = "1234.000";
        BigDecimal bigDecimal = new BigDecimal(s);
        BigDecimal bigDecimal1 = new BigDecimal(s1);
        System.out.println(bigDecimal.compareTo(bigDecimal1));
    }
}