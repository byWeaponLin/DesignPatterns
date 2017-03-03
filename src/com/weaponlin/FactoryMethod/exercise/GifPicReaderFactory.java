package com.weaponlin.FactoryMethod.exercise;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class GifPicReaderFactory implements PicReaderFactory {
    @Override
    public PicReader createPicReader() {
        GifPicReader g = new GifPicReader();
        return g;
    }
}
