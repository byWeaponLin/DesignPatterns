package com.weaponlin.Strategy.exercise;

/**
 * Created by Weapon Lin on 2017/2/23.
 */
public class PlaneSystem {
    private PlaneCategory pc;
    private PlaneFeature pf;
    private FlyFeature ff;

    public PlaneSystem(PlaneCategory pc,PlaneFeature pf,FlyFeature ff){
        this.pc = pc;
        this.pf = pf;
        this.ff = ff;
    }

    //输出基本信息
    public void info(){
        pc.category();
        pf.feature();
        ff.fly();
    }

    public static void main(String[] args) {
        PlaneCategory pc = new AirPlane();
        PlaneFeature pf = new LongDistanceTakeOff();
        FlyFeature ff = new SubSonicFly();
        PlaneSystem system = new PlaneSystem(pc,pf,ff);
        system.info();
    }
}
