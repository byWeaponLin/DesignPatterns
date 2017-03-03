package com.weaponlin.Observer;

/**
 * Created by Weapon Lin on 2017/1/13.
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName){
        this.allyName = allyName;
        System.out.println(allyName + "战队组建成功");
    }

    @Override
    public void notifyAllPlayer(String name) {
        System.out.println(this.allyName + "战队紧急通知，队友" + name + "受到敌方攻击！");
        //编辑观察者集合，调用每个队友（除自己）的支援方法
        for(Observer o : players){
            if(!o.getName().equals(name)) {
                o.help();
            }
        }
    }
}
