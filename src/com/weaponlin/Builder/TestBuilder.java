package com.weaponlin.Builder;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/13.
 */
public class TestBuilder {

    @Test
    public void test(){
        HeroBuilder hb = new HeroBuilder();
        ActorController ac = new ActorController();
        Actor man = ac.construct(hb);
        sout(man);
        AngelBuilder ab = new AngelBuilder();
        Actor girl = ac.construct(ab);
        sout(girl);
    }

    public void sout(Actor a){
        System.out.println(a.getType());
        System.out.println(a.getFace());
        System.out.println(a.getSex());
        System.out.println(a.getCostume());
        System.out.println(a.getHairstyle());
    }
}
