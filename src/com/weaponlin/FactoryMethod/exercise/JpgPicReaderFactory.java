package com.weaponlin.FactoryMethod.exercise;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class JpgPicReaderFactory implements PicReaderFactory {
    @Override
    public PicReader createPicReader() {
        JpgPicReader j = new JpgPicReader();

        return j;
    }
}
