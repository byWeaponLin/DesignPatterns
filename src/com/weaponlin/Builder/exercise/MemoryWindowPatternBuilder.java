package com.weaponlin.Builder.exercise;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class MemoryWindowPatternBuilder extends WindowPatternBuilder {

    //void buildPart1()
    //void buildPart2()
    //void buildPart3()
    //因为过于简单，所有直接写在build方法中

    @Override
    public void build() {
        win.setMainWindow("mainWin");
        win.setControlStrip("controlStrip");
        win.setFavoList("favoList");
    }
}
