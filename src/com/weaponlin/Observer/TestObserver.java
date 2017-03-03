package com.weaponlin.Observer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Weapon Lin on 2017/1/13.
 */
public class TestObserver {

    @Test
    public void test(){
        //定义观察者目标对象
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");
        //定义观察者对象
        Observer p1,p2,p3,p4;
        p1 = new Player("杨过");
        acc.join(p1);

        p2 = new Player("令狐冲");
        acc.join(p2);

        p3 = new Player("段誉");
        acc.join(p3);

        p4 = new Player("张无忌");
        acc.join(p4);

        //队员受到攻击
        p2.beAttacked(acc);
    }

    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator it = list.iterator();
        it.next();
        it.remove();
//        list.listIterator();
    }
}
