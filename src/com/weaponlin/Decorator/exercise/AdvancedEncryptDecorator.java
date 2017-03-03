package com.weaponlin.Decorator.exercise;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class AdvancedEncryptDecorator extends DataEncryptDecorator{


    public AdvancedEncryptDecorator(DataEncrypt encrypt) {
        super(encrypt);
    }

    @Override
    public String encrypt(String text) {
        String value = super.encrypt(text);

        return advancedEncrypt(value);
    }

    public String advancedEncrypt(String text){
        char[] chars = text.toCharArray();
        for(int i=0,j=chars.length;i < j;i++){
            chars[i] += 3;
        }

        return new String(chars);
    }
}
