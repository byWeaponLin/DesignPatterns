package com.weaponlin.SimpleFactory;

/**
 * 折线图
 * Created by Weapon Lin on 2017/1/15.
 */
public class LineChart implements Chart{

    public LineChart(){
        System.out.println("create lineChart!");
    }
    @Override
    public void display() {
        System.out.println("show lineChart!");
    }
}
