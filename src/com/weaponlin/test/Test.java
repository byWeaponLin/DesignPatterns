package com.weaponlin.test;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class Test {

    @org.junit.Test
    public void testReflection(){
        try {
            Class c = Class.forName("String");
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
