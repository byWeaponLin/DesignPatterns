package com.weaponlin.AbstractFactory;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
