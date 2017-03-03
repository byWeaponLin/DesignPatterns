package com.weaponlin.Singleton.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class Exer3Test extends Thread {

    @Override
    public void run() {
//        System.out.println(LoadBalancer3.getLoadBalancer());
        LoadBalancer3.getLoadBalancer();
    }

    @Test
    public void test(){
        for(int i = 0;i < 50000;i++){
            Exer3Test et = new Exer3Test();
            et.start();
        }
    }
}
