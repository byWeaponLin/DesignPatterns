package com.weaponlin.Builder.exercise;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class TidyWindowPatternBuilder extends WindowPatternBuilder {
    @Override
    public void build() {
        win.setMainWindow("mainWin");
        win.setControlStrip("controlStrip");
    }
}
