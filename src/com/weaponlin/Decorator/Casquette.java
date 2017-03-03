package com.weaponlin.Decorator;

/**
 * Created by Weapon Lin on 2017/1/10.
 */
public class Casquette extends HatDecorator {
    private Person person;

    public Casquette(Person person){
        this.person = person;
    }

    @Override
    public String getDesc() {
        return person.getDesc() + " one casquetee ";
    }

    @Override
    public double cost() {
        return 75 + person.cost();
    }
}
