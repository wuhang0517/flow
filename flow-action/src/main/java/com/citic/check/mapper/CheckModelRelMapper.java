package com.citic.check.mapper;

import com.citic.check.pojo.CheckModelRel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CheckMoelRelMapper
 * @Description
 * @Author lin
 * @Date 2020/8/11 16:53
 * @Version 1.0
 */
@Mapper
public interface CheckModelRelMapper {

    List<CheckModelRel> selectCheckModelByTradetype(String tradeType);

}
