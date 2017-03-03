package com.weaponlin.Facade;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class FileReader {
    public String read(String fileName){
        //读取文件，这里并没有实现

        //将文件中的内容保存到source中
        String source = "content";
        System.out.println("读取文件成功，内容为：" + source);
        return source;
    }
}
