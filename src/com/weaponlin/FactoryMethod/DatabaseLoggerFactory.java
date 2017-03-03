package com.weaponlin.FactoryMethod;

/**
 * 数据库日志记录器工厂：具体工厂
 * Created by Weapon Lin on 2017/1/15.
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
