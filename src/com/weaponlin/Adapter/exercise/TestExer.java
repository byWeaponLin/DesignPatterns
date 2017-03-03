package com.weaponlin.Adapter.exercise;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/2/8.
 */
public class TestExer {

    @Test
    public void test(){
        DBOperate db = new DBAdapter();
        db.save("hello world");
    }
}
