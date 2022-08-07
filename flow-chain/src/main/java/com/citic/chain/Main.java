package com.citic.chain;

import com.citic.chain.check.BlackListCheck;
import com.citic.chain.check.InvCheck;
import com.citic.chain.filter.AutoActionFilter;
import org.apache.commons.chain.impl.ChainBase;

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


        A thread = new A();
        new Thread(thread).start();

    }

    static class A implements Runnable {

        public A() {
        }

        @Override
        public void run() {

        }
    }
}
