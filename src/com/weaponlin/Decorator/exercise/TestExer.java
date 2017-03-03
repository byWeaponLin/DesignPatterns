package com.weaponlin.Decorator.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class TestExer {

    @Test
    public void test(){
        //简单加密
        DataEncrypt encrypt = new SimpleEncrypt();
        System.out.println(encrypt.encrypt("abc"));

        //二次加密
        DataEncrypt common = new CommonEncryptDecorator(encrypt);
        System.out.println(common.encrypt("abc"));

        //三次加密
        DataEncrypt advanced = new AdvancedEncryptDecorator(common);
        System.out.println(advanced.encrypt("abc"));
    }
}
