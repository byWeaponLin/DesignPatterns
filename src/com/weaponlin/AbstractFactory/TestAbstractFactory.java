package com.weaponlin.AbstractFactory;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class TestAbstractFactory {

    @Test
    public void test(){
        SkinFactory skinFactory = new SpringSkinFactory();
        Button button = skinFactory.createButton();
        button.display();

        SkinFactory skinFactory1 = new SummerSkinFactory();
        TextField textField = skinFactory1.createTextField();
        textField.display();
    }
}
