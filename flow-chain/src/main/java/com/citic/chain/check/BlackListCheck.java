package com.citic.chain.check;

import com.citic.base.pojo.oure.BasePojo;
import com.citic.oure.pojo.ZxcwOurePojo;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * @ClassName BlackListCheck
 * @Description 黑名单校验
 * @Author lin
 * @Date 2020/12/13 下午10:02
 * @Version 1.0
 */
public class BlackListCheck implements Command {

    /**
     * @param context
     * @return
     * @throws Exception
     */
    @Override
    public boolean execute(Context context) throws Exception {
        ZxcwOurePojo pojo = (ZxcwOurePojo) context.get("pojo");

        if ("1456".equals(pojo.getBlackList())) {
            System.out.println("黑名单校验通过");
            context.put("result", true);
            return false;
        }
        System.out.println("黑名单校验不通过");
        context.put("result", false);
        return true;
    }
}
