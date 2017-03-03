package com.weaponlin.Strategy;

/**
 * Created by Weapon Lin on 2017/1/9.
 */
public class Context {
    private SortAlgorithm sortAlgorithm;

    public Context(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public void sort(){
        sortAlgorithm.sort();
    }
}
