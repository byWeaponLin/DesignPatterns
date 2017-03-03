package com.weaponlin.SimpleFactory;

/**
 * 饼状图
 * Created by Weapon Lin on 2017/1/15.
 */
public class PieChart implements Chart {

    public PieChart(){
        System.out.println("create pieChart!");
    }
    @Override
    public void display() {
        System.out.println("show pieChart!");
    }
}
