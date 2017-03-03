package com.weaponlin.AbstractFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class AndroidIntefaceCtrl implements InterfaceCtrl {
    @Override
    public void start() {
        System.out.println("start interface : android");
    }

    @Override
    public void over() {
        System.out.println("over interface : android");
    }
}
