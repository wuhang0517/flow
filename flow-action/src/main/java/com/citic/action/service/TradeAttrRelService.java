package com.citic.action.service;

import com.citic.action.mapper.TradeAttrRelMapper;
import com.citic.action.pojo.TradeAttrRel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TradeAttrRelservice
 * @Description 渠道属性关系service
 * @Author lin
 * @Date 2020/8/21 09:19
 * @Version 1.0
 */
@Service
public class TradeAttrRelService {


    static TradeAttrRelMapper tradeAttrRelMapper;

    @Autowired
    public TradeAttrRelService(TradeAttrRelMapper tradeAttrRelMapper) {
        this.tradeAttrRelMapper = tradeAttrRelMapper;
    }

    /**
     * 通过渠道类型获取渠道属性的默认值
     *
     * @param tradeType
     * @return
     */
    public static List<TradeAttrRel> selectAttrByTrade(String tradeType) {
        List<TradeAttrRel> tradeAttrRels = tradeAttrRelMapper.selectByTradeType(tradeType);
        return tradeAttrRels;
    }
}
