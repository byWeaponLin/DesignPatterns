package com.weaponlin.Singleton;

/**
 * version1.3
 * @author Weapon Lin
 *
 */
public class Singleton3 {
	private static Singleton3 instance = null;
	private Singleton3(){};
	
	//双重检查
	public static Singleton3 getInstance(){
		if(instance == null){
			synchronized (Singleton3.class) {
				if(instance == null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
	/*
	这个版本又叫“双重检查”Double-Check。下面是说明：
		1.第一个条件是说，如果实例创建了，那就不需要同步了，直接返回就好了。
		2.不然，我们就开始同步线程。
		3.第二个条件是说，如果被同步的线程中，有一个线程创建了对象，那么别的线程就不用再创建了。
	
	但是，instance = new Singleton3()这句代码并不是一个原子操作，在JVM中做了如下三件事：
		1.给 singleton 分配内存
		2.调用 Singleton 的构造函数来初始化成员变量，形成实例
		3.将singleton对象指向分配的内存空间（执行完这步 singleton才是非 null 了）
	但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，
	最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，
	这时 instance 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，
	然后顺理成章地报错。
	
	
	
	
	*/
}
