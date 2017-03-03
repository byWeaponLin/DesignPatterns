package com.weaponlin.Adapter;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort quickSort;    //定义适配者QuickSort对象
    private BinarySearch binarySearch; //定义适配者BinarySearch对象

    public OperationAdapter(){
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array,key);
    }
}
