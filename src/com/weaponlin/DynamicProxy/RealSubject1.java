package com.weaponlin.DynamicProxy;

/**
 * Created by Weapon Lin on 2017/2/10.
 */
public class RealSubject1 implements Subject1 {
    @Override
    public int test(int param) {
        return param;
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}
