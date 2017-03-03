package com.weaponlin.Builder;

/**
 * Created by Weapon Lin on 2017/1/12.
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("man");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("kuijia");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("man's hair");
    }
}
