package com.weaponlin.DynamicProxy;

/**
 * Created by Weapon Lin on 2017/2/10.
 */
public class Test {

    private Test(){

    }

    @org.junit.Test
    public void test(){
//        RealSubject rs = new RealSubject();
//        System.out.println(rs.getClass() == RealSubject.class);

        try {
            Test rs0 = Test.class.newInstance();  //通过Class来创建对象的类必须只有一个且为pubilc的无参构造函数
            System.out.println(rs0);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
