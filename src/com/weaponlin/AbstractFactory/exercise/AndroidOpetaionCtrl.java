package com.weaponlin.AbstractFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class AndroidOpetaionCtrl implements OperationCtrl {
    @Override
    public void attack() {
        System.out.println("attack: android operation controller.");
    }

    @Override
    public void ahead() {
        System.out.println("ahead: android operation controller.");
    }
}
