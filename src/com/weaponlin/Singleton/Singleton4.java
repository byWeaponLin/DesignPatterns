package com.weaponlin.Singleton;

/**
 * version1.4
 * @author Weapon Lin
 *
 */
public class Singleton4 {
	private static volatile Singleton4 instance = null;
	private Singleton4(){};
	
	//双重检查
	public static Singleton4 getInstance(){
		if(instance == null){
			synchronized (Singleton4.class) {
				if(instance == null){
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
	/*
	对于version1.3的那个问题，我们只需要将instance声明为volatile就可以了。
	使用 volatile 有两个功用：
		1）这个变量不会在多个线程中存在复本，直接从内存读取。
		2）这个关键字会禁止指令重排序优化。也就是说，在 volatile 变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），
		      读操作不会被重排序到内存屏障之前。

	但是，这个事情仅在Java 1.5版后有用，1.5版之前用这个变量也有问题，因为老版本的Java的内存模型是有缺陷的。
	
	
	
	*/
}

