package com.weaponlin.Singleton.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class Exer1Test extends Thread {

    public static final int COUNT = 500;

    @Override
    public void run() {
        System.out.println(LoadBalancer1.getLoadBalancer());
    }

    @Test
    public void test(){
        for(int i = 0;i < COUNT;i++){
            Exer1Test t = new Exer1Test();
            t.start();
        }
    }
}
