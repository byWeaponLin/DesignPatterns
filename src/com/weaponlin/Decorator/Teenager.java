package com.weaponlin.Decorator;

/**
 * Created by Weapon Lin on 2017/1/10.
 */
public class Teenager extends Person{
    public Teenager(){
        desc = "shopping list : ";
    }

    @Override
    public double cost() {
        return 0;
    }
}
