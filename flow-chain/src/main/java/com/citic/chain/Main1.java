package com.citic.chain;

import com.google.common.io.Resources;
import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.CatalogFactory;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.config.ConfigParser;
import org.apache.commons.chain.impl.ContextBase;

import java.net.URL;

/**
 * @ClassName Main
 * @Description 主流程
 * @Author lin
 * @Date 2020/12/13 下午10:52
 * @Version 1.0
 */
public class Main1 {

    public static void main(String[] args) throws Exception{
        Context context = new ContextBase();
        ConfigParser parser = new ConfigParser();
        URL file = Resources.getResource("catlog.xml");
        parser.parse(file);
        Catalog catalog = CatalogFactory.getInstance().getCatalog();
        Command commandChain = catalog.getCommand("CommandChain");
        commandChain.execute(context);

     }
}
