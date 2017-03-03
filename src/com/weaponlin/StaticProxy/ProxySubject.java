package com.weaponlin.StaticProxy;

/**
 * 代理对象
 * Created by Weapon Lin on 2017/1/8.
 */
public class ProxySubject implements Subject {
    //维持对真实委托对象的引用，该对象才是真正的执行者
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        System.out.println("before invoking method,i can do other things.");
        //真实委托对象，通过代理对象的引用，间接的实现了对目标对象的访问
        realSubject.visit();

        System.out.println("after invoking method,i can do other things too.");
    }
}
