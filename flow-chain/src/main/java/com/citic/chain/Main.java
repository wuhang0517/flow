package com.citic.chain;

import com.citic.chain.check.BlackListCheck;
import com.citic.chain.check.InvCheck;
import com.citic.chain.filter.AutoActionFilter;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

/**
 * @ClassName Main
 * @Description 主流程
 * @Author lin
 * @Date 2020/12/13 下午10:52
 * @Version 1.0
 */
public class Main extends ChainBase {


    public Main() {
        super();
        addCommand(new AutoActionFilter<>());
        addCommand(new BlackListCheck());
        addCommand(new InvCheck());
    }

    public static void main(String[] args) {
        Main main = new Main();
        Context context = new ContextBase();
        try {
            main.execute(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
