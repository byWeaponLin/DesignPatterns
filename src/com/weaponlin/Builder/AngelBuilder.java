package com.weaponlin.Builder;

/**
 * Created by Weapon Lin on 2017/1/13.
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("angel");
    }

    @Override
    public void buildSex() {
        actor.setSex("girl");
    }

    @Override
    public void buildFace() {
        actor.setFace("beautiful");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("skirt");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("long hair");
    }
}
