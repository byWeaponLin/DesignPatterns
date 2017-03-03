package com.weaponlin.AbstractFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class IOSInterfaceCtrl implements InterfaceCtrl {
    @Override
    public void start() {
        System.out.println("start interface : IOS");
    }

    @Override
    public void over() {
        System.out.println("over interface : IOS");
    }
}
