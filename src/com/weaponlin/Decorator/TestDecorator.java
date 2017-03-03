package com.weaponlin.Decorator;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/10.
 */
public class TestDecorator {

    @Test
    public void test(){
        Person person = new Teenager();

        person = new Shirt(person);
        person = new Casquette(person);

        System.out.println(person.getDesc() + "," + person.cost());
    }
}
