package com.weaponlin.SimpleFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class Triangle implements DrawTool {
    @Override
    public void draw() {
        System.out.println("draw triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase triangle");
    }
}
