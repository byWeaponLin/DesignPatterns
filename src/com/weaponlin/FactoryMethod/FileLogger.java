package com.weaponlin.FactoryMethod;

/**
 * 文件日志记录器：具体产品
 * Created by Weapon Lin on 2017/1/15.
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("writing file log.");
    }
}
