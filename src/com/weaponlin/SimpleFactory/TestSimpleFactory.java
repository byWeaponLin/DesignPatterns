package com.weaponlin.SimpleFactory;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/15.
 */
public class TestSimpleFactory {

    @Test
    public void test(){
        Chart chart = ChartFactory.getChart("pieChart");
        chart.display();
    }
}
