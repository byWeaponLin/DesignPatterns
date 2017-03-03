package com.weaponlin.Builder.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class ExerTest {

    @Test
    public void test(){
        WindowPatternBuilder builder = new IntegratedWindowPatterBuilder();
        WindowPattern win = builder.createWindow();
        System.out.println(win.getMenu());
        System.out.println(win.getFavoList());
    }
}
