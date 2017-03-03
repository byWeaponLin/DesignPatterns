package com.weaponlin.Decorator;

/**
 * Created by Weapon Lin on 2017/1/9.
 */
public abstract class Person {
    String desc = "unknown";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
