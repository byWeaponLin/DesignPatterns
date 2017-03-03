package com.weaponlin.Builder;

/**
 * Created by Weapon Lin on 2017/1/13.
 */
public class ActorController {
    //逐步构建对象的每一部分
    public Actor construct(ActorBuilder ab){
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        return ab.createActor();
    }
}
