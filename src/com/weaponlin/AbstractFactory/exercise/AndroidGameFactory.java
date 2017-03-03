package com.weaponlin.AbstractFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class AndroidGameFactory implements GameFactory {
    @Override
    public OperationCtrl createOperationCtrl() {
        OperationCtrl op = new AndroidOpetaionCtrl();
        return op;
    }

    @Override
    public InterfaceCtrl createInterfaceCtrl() {
        InterfaceCtrl inte = new AndroidIntefaceCtrl();
        return inte;
    }
}
