package com.weaponlin.Adapter.exercise;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class DBAdapter implements DBOperate {

    EncryptAdaptee adaptee;

    public DBAdapter(){
        adaptee = new EncryptAdaptee();
    }

    @Override
    public void save(String pwd) {
        String text = adaptee.encrypt(pwd);

        //接下来将数据保存到数据库中:略

    }
}
