package com.weaponlin.AbstractFactory.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class TestExer {

    @Test
    public void test(){
        GameFactory gFactory = new IOSGameFactory();

        OperationCtrl op = gFactory.createOperationCtrl();
        op.attack();
        op.ahead();

        InterfaceCtrl inte = gFactory.createInterfaceCtrl();
        inte.start();
        inte.over();

    }
}
