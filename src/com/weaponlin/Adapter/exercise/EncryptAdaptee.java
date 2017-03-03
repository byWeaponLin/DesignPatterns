package com.weaponlin.Adapter.exercise;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class EncryptAdaptee {
    public String encrypt(String text){
        if(text == null){
            text = "null";
        }
        char[] chars = text.toCharArray();
        for(int i=0,j=chars.length;i < j;i++){
            chars[i] += 2;
        }

        return new String(chars);
    }
}
