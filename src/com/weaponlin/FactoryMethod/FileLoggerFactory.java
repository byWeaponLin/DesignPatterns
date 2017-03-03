package com.weaponlin.FactoryMethod;

/**
 * 文件日志记录器工厂类：具体工厂
 * Created by Weapon Lin on 2017/1/15.
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
