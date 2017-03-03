package com.weaponlin.AbstractFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public class IOSGameFactory implements GameFactory {
    @Override
    public OperationCtrl createOperationCtrl() {
        OperationCtrl op = new IOSOpetaionCtrl();
        return op;
    }

    @Override
    public InterfaceCtrl createInterfaceCtrl() {
        InterfaceCtrl inte = new IOSInterfaceCtrl();
        return inte;
    }
}
