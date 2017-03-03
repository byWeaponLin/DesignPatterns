package com.weaponlin.Singleton.exercise;

/**
 * 静态内部类实现
 * Created by Weapon Lin on 2017/2/7.
 */
public class LoadBalancer3 {

//    private static LoadBalancer3 lb = null;

    private LoadBalancer3(){}

    private static class Holder{
        private static LoadBalancer3 lb = new LoadBalancer3();
    }

    public static LoadBalancer3 getLoadBalancer(){
        return Holder.lb;
    }
}
