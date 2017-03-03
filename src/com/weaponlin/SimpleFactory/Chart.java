package com.weaponlin.SimpleFactory;

/**
 * 抽象产品类，图表
 * Created by Weapon Lin on 2017/1/15.
 */
public interface Chart {
    void display();
}

/**
 * 另外：
 * 在使用简单工厂模式时，首先需要对产品类进行重构，不能设计一个包罗万象的产品类，而需根据实际情况设计一个产品层次结构，
 * 将所有产品类公共的代码移至抽象产品类，并在抽象产品类中声明一些抽象方法，
 * 以供不同的具体产品类来实现，
 * 在具体产品类中实现了抽象产品类中声明的抽象业务方法，不同的具体产品类可以提供不同的实现，
 */
/*
public abstract class Chart{
    void methodSame();

    void methodDiff();
}
*/
