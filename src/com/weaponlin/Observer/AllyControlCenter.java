package com.weaponlin.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 战队控制中心类：目标类
 * Created by Weapon Lin on 2017/1/13.
 */
public abstract class AllyControlCenter {
    protected String allyName;  //战队名称
    protected List<Observer> players = new ArrayList<Observer>();  //定义集合存储战队成员

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    /*新成员加入战队*/
    public void join(Observer observer){
        System.out.println(observer.getName() + "加入战队了");
        players.add(observer);
    }

    /*离开战队*/
    public void quit(Observer observer){
        System.out.println(observer.getName() + "离开战队了");
        players.remove(observer);
    }

    public abstract void notifyAllPlayer(String name);
}
