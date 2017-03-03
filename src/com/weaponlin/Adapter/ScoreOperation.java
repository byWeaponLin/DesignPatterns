package com.weaponlin.Adapter;

/**
 * 抽象成绩操作类：目标接口
 * Created by Weapon Lin on 2017/1/16.
 */
public interface ScoreOperation {

    int[] sort(int[] array); //成绩排序
    int search(int[] array,int key);    //成绩查询
}
