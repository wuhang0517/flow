package com.citic.check.inter;

import com.citic.base.pojo.check.CheckRequestParam;
import com.citic.base.pojo.check.CheckResponse;

/**
 * @ClassName CheckInter
 * @Description 统一的检查入口
 * @Author lin
 * @Date 2020/8/6 23:10
 * @Version 1.0
 */
public interface CheckInter<T extends CheckRequestParam> {

    int isUsed = 0;

    /**
     * 基础的查验
     *
     * @return
     */
    CheckResponse baseCheck(T requestParam);

}
