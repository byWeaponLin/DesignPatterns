package com.weaponlin.FactoryMethod;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/15.
 */
public class TestFactoryMethod {


    @Test
    public void test(){
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
