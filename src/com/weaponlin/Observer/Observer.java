package com.weaponlin.Observer;

/**
 * 抽象观察类
 * Created by Weapon Lin on 2017/1/13.
 */
public interface Observer {
    String getName();
    void getName(String name);
    void help();
    void beAttacked(AllyControlCenter acc); //遭受攻击方法
}
