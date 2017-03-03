package com.weaponlin.DynamicProxy;

/**
 * 委托类/被代理类
 * Created by Weapon Lin on 2017/1/8.
 */
public class RealSubject implements Subject{
    @Override
    public void visit() {
        System.out.println("RealSubject");
    }
}
