package com.weaponlin.Iterator;

/**
 * 抽象迭代器
 * Created by Weapon Lin on 2017/1/15.
 */
public interface AbstractIterator {
    public boolean hasNext(); //移至下一个元素
    public boolean isLast(); //判断是否为最后一个元素
    public void previous(); //移至上一个元素
    public boolean isFirst(); //判断是否为第一个元素
    public Object getNextItem(); //获取下一个元素
    public Object getPreviousItem(); //获取上一个元素
}
