package com.weaponlin.Observer;

/**
 * Created by Weapon Lin on 2017/1/13.
 */
public class Player implements Observer {

    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，"+ this.name +"马上过去救你！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "受到敌人的攻击！");
        acc.notifyAllPlayer(this.name);
    }
}
