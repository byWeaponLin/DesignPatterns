package com.weaponlin.AbstractFactory;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
