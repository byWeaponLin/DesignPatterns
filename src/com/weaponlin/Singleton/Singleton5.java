package com.weaponlin.Singleton;

/**
 * version1.5
 * @author Weapon Lin
 *
 */
public class Singleton5 {
	private volatile static Singleton5 instance = new Singleton5();
	private Singleton5(){};
	
	public static Singleton5 getInstance(){
		return instance;
	}
	
	/*
	这种方法非常简单，因为单例的实例被声明成 static 和 final 变量了，
	在第一次加载类到内存中时就会初始化，所以创建实例本身是线程安全的。

	但是，这种玩法的最大问题是——当这个类被加载的时候，new Singleton() 这句话就会被执行，
	就算是getInstance()没有被调用，类也被初始化了。

	于是，这个可能会与我们想要的行为不一样，比如，我的类的构造函数中，有一些事可能需要依赖于别的类
	干的一些事（比如某个配置文件，或是某个被其它类创建的资源），我们希望他能在我第一次getInstance()时
	才被真正的创建。这样，我们可以控制真正的类创建的时刻，而不是把类的创建委托给了类装载器。

	*/
}
