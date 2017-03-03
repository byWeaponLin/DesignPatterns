package com.weaponlin.SimpleFactory.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class TestExer {

    @Test
    public void test(){
        DrawTool dt = DrawToolFactory.getDrawTool("circle");
        dt.draw();
    }
}
