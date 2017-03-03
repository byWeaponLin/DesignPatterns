package com.weaponlin.Decorator.exercise;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class DataEncryptDecorator implements DataEncrypt {

    private DataEncrypt encrypt;

    public DataEncryptDecorator(DataEncrypt encrypt){
        this.encrypt = encrypt;
    }

    @Override
    public String encrypt(String text) {
        return encrypt.encrypt(text);
    }
}
