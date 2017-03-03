package com.weaponlin.AbstractFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/7.
 */
public interface GameFactory {

    OperationCtrl createOperationCtrl();

    InterfaceCtrl createInterfaceCtrl();
}
