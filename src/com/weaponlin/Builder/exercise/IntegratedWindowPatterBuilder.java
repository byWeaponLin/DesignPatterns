package com.weaponlin.Builder.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class IntegratedWindowPatterBuilder extends WindowPatternBuilder{

    @Override
    public void build() {
        win.setMenu("menu");
        win.setPlayList("playList");
        win.setMainWindow("mainWin");
        win.setControlStrip("controlStrip");
    }
}
