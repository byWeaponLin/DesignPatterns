package com.weaponlin.Iterator;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Weapon Lin on 2017/1/15.
 */
public class TestIteraor {

    @Test
    public void test(){
        AbstractObjectList aol = new ProductList(new ArrayList<Object>());
        Product p1 = new Product(1,"打火机",1.5);
        aol.addObject(p1);
        Product p2 = new Product(2,"笔记本",5);
        aol.addObject(p2);
        Product p3 = new Product(3,"台灯",65);
        aol.addObject(p3);
        AbstractIterator it = aol.createIterator();
        while(it.hasNext()){
            System.out.println((Product)it.getNextItem());
        }
    }
}
