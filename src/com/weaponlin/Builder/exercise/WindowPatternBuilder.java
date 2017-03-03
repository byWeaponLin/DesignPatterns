package com.weaponlin.Builder.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public abstract class WindowPatternBuilder {
    protected  WindowPattern win = new WindowPattern();

    public abstract void build();

    public WindowPattern createWindow(){
        build();

        return win;
    }
}
