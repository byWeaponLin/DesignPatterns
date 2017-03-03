package com.weaponlin.Facade;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class CipherMachine {

    public String encrypt(String source){
        StringBuilder result = new StringBuilder();
        char[] chars = source.toCharArray();
        for(char ch : chars){
            result.append(ch%5);
        }
        System.out.println("已加密，密文为：" + result.toString());
        return result.toString();
    }
}
