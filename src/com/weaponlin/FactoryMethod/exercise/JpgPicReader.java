package com.weaponlin.FactoryMethod.exercise;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class JpgPicReader implements PicReader {
    @Override
    public void readPic(String path) {
        System.out.println("read jpg pictures.");
    }
}
