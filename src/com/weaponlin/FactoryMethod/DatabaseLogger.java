package com.weaponlin.FactoryMethod;

/**
 * 数据库日志记录器：具体产品
 * Created by Weapon Lin on 2017/1/15.
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("writing database log.");
    }
}
