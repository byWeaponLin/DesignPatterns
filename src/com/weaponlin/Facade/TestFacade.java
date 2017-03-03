package com.weaponlin.Facade;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class TestFacade {

    @Test
    public void test(){
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.encryptFile("test.txt");
    }
}
