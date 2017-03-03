package com.weaponlin.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Weapon Lin on 2017/1/15.
 */
public class TestArrayListRemove {

    @Test
    public void test(){
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("a");
        list.add("c");
        list.add("a");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if("a".equals(it.next())){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
