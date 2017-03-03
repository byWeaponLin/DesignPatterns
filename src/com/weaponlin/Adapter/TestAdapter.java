package com.weaponlin.Adapter;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class TestAdapter {

    @Test
    public void test(){
        int[] scores = {69,90,88,76,59,89,93};
        System.out.print("before sorting: ");
        showArray(scores);
        ScoreOperation sop = new OperationAdapter();
        System.out.print("after sorting: ");
        showArray(sop.sort(scores));

        System.out.println(sop.search(scores,88));

        System.out.println(sop.search(scores,60));
    }

    public void showArray(int[] array){
        for(int i : array){
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
