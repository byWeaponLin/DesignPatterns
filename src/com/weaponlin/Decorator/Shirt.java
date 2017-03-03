package com.weaponlin.Decorator;

/**
 * Created by Weapon Lin on 2017/1/10.
 */
public class Shirt extends ClothingDecorator {
    private Person person;

    public Shirt(Person person){
        this.person = person;
    }

    @Override
    public String getDesc() {
        return person.getDesc() + " one shirt ";  //"one shirt" 就是具体装饰的东西
    }

    @Override
    public double cost() {
        return 100 + person.cost();  //100就是具体装饰的东西
    }
}
