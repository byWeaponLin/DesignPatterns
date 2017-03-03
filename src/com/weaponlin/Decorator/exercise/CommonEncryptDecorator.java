package com.weaponlin.Decorator.exercise;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class CommonEncryptDecorator extends DataEncryptDecorator {

    public CommonEncryptDecorator(DataEncrypt encrypt) {
        super(encrypt);
    }

    @Override
    public String encrypt(String text) {
        String value = super.encrypt(text);

        return commonEncrypt(value);
    }

    public String commonEncrypt(String text){
        char[] chars = text.toCharArray();
        for(int i=0,j=chars.length;i < j;i++){
            chars[i] += 2;
        }

        return new String(chars);
    }
}
