package com.weaponlin.AbstractFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class IOSOpetaionCtrl implements OperationCtrl {
    @Override
    public void attack() {
        System.out.println("attack: IOS operation controller.");
    }

    @Override
    public void ahead() {
        System.out.println("ahead: IOS operation controller.");
    }
}
