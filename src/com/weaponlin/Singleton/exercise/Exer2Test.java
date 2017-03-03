package com.weaponlin.Singleton.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class Exer2Test extends Thread {

    @Override
    public void run() {
//        System.out.println(LoadBalancer2.getLoadBalancer());
        LoadBalancer2.getLoadBalancer();
    }

    @Test
    public void test(){
        for(int i = 0; i < 50000;i++){
            Exer2Test et = new Exer2Test();
            et.start();
        }
    }
}
