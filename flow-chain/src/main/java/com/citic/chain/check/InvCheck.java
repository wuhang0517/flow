package com.citic.chain.check;

import com.citic.base.pojo.oure.BasePojo;
import com.citic.oure.pojo.ZxcwOurePojo;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * @ClassName InvCheck
 * @Description 发票查验
 * @Author lin
 * @Date 2020/12/13 下午10:01
 * @Version 1.0
 */
public class InvCheck implements Command {

    @Override
    public boolean execute(Context context) throws Exception {
        ZxcwOurePojo pojo = (ZxcwOurePojo) context.get("pojo");
        if ("123".equals(pojo.getInvCode())) {
            System.out.println("发票校验通过");
            context.put("result", true);
            return false;
        }
        System.out.println("发票校验不通过");
        context.put("result", false);
        return true;
    }
}
