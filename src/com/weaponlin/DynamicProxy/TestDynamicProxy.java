package com.weaponlin.DynamicProxy;

import com.weaponlin.StaticProxy.ProxySubject;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Weapon Lin on 2017/1/8.
 */
public class TestDynamicProxy {

    @Test
    public void test(){
        //委托/真实对象
        RealSubject realSubject = new RealSubject();
        //我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象调用方法的
        InvocationHandler handler = new DynamicProxy(realSubject);

        Subject proxyInstance =
                (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),RealSubject.class.getInterfaces(),handler);
        System.out.println(proxyInstance.getClass().getName());
        System.out.println(Subject.class.getName());
        proxyInstance.visit();
    }

    @Test
    public void test1(){
        Subject1 rl = new RealSubject1();

        InvocationHandler handler = new DynamicProxy1(rl);

        Subject1 s1 = (Subject1)Proxy.newProxyInstance(rl.getClass().getClassLoader(),rl.getClass().getInterfaces(),handler);

        System.out.println(s1.getClass().getName());
        System.out.println(s1.getClass().getInterfaces()[0].getName());
        System.out.println(s1.test(10));
        s1.test();
    }
}
