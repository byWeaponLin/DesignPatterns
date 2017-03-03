package com.weaponlin.Singleton.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 饿汉实现
 * Created by Weapon Lin on 2017/2/7.
 */
public class LoadBalancer1 {
    private static LoadBalancer1 lb = new LoadBalancer1();

    private List<String> servers = new ArrayList<String>();

    private LoadBalancer1(){

    }

    public static LoadBalancer1 getLoadBalancer(){
        return lb;
    }

    public void addServer(String server){
        servers.add(server);
    }

    public void removeServer(String server){
        servers.remove(server);
    }


}
