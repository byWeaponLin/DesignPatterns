package com.weaponlin.Singleton.exercise;

/**
 * 双重检查的懒汉式实现
 * Created by Weapon Lin on 2017/2/7.
 */
public class LoadBalancer2 {

    private static LoadBalancer2 lb = null;

    private LoadBalancer2(){}

    public static LoadBalancer2 getLoadBalancer(){
        if(lb == null){
            synchronized (LoadBalancer2.class){
                if(lb == null){
                    lb = new LoadBalancer2();
                }
            }
        }
        return lb;
    }
}
