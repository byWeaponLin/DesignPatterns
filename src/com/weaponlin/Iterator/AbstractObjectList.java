package com.weaponlin.Iterator;

import java.util.List;
import java.util.ArrayList;

/**
 * 抽象聚合类
 * Created by Weapon Lin on 2017/1/15.
 */
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<Object>();

    public AbstractObjectList(List objects){
        this.objects = objects;
    }

    public void addObject(Object o){
        this.objects.add(o);
    }

    public void removeObject(Object o){
        this.objects.remove(o);
    }

    public List<Object> getObjects(){
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();
}
