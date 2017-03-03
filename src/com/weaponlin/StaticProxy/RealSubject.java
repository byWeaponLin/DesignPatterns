package com.weaponlin.StaticProxy;

/**
 * 真实访问对象/委托对象
 * Created by Weapon Lin on 2017/1/8.
 */
public class RealSubject implements Subject {

    @Override
    public void visit() {
        System.out.println("RealSubject");
    }
}
