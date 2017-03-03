package com.weaponlin.FactoryMethod.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class TestExer {

    @Test
    public void test(){
        PicReaderFactory picReaderFactory = new GifPicReaderFactory();
        PicReader picReader = picReaderFactory.createPicReader();

        picReader.readPic("c://");

        picReaderFactory = new JpgPicReaderFactory();
        picReader = picReaderFactory.createPicReader();
        picReader.readPic("e://");
    }
}
