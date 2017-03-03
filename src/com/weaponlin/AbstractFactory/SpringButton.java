package com.weaponlin.AbstractFactory;

/**
 * spring button：具体产品
 * Created by Weapon Lin on 2017/1/16.
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("spring button.");
    }
}
