package com.weaponlin.Strategy;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/9.
 */
public class TestStrategy {
    @Test
    public void test(){
        //BubbleSort
        Context context1 = new Context(new BubbleSort());
        context1.sort();

        //FastSort
        Context context2 = new Context(new FastSort());
        context2.sort();

        //SelectionSort
        Context context3 = new Context(new SelectionSort());
        context3.sort();
    }
}
