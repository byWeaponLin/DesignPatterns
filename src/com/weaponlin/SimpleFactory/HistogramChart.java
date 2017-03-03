package com.weaponlin.SimpleFactory;

/**
 * 柱状图
 * Created by Weapon Lin on 2017/1/15.
 */
public class HistogramChart implements Chart {

    public HistogramChart(){
        System.out.println("create histogramChart!");
    }

    @Override
    public void display() {
        System.out.println("show histogramChart!");
    }
}
