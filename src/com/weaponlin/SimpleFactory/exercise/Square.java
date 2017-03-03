package com.weaponlin.SimpleFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class Square implements DrawTool {
    @Override
    public void draw() {
        System.out.println("draw square");
    }

    @Override
    public void erase() {
        System.out.println("erase square");
    }
}
