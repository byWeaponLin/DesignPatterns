package com.weaponlin.StaticProxy;

/**
 * Created by Weapon Lin on 2017/1/8.
 */
public class TestStaticProxy {

    public static void main(String[] args){
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
    }
}
