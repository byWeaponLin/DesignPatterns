package com.weaponlin.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理类
 * Created by Weapon Lin on 2017/1/8.
 */
public class DynamicProxy implements InvocationHandler {
    //要代理的真实/委托对象
    private Object subject;

    //为委托对象赋值
    public DynamicProxy(Object obj){
        this.subject = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在委托对象操作前，可以添加一些自己的操作
//        System.out.println("before invoking method....");

        System.out.println(proxy.getClass().getName());
        //当年代理对象调用委托对象的方法时，会自动跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object result = method.invoke(subject,args);

        //在委托对象执行完成后，也可以添加一些自己的操作
//        System.out.println("after invoking method......");
        return result;
    }
}
