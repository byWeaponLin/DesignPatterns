package com.weaponlin.Strategy.exercise;

/**
 * Created by Weapon Lin on 2017/2/23.
 */
public class SubSonicFly implements FlyFeature {
    @Override
    public void fly() {
        System.out.println("飞行特征：亚音速飞行");
    }
}
