package com.weaponlin.Singleton;

public class TestSingleton1 extends Thread{
	public static Singleton1 s1;
	
	@Override
	public void run() {
		s1 = Singleton1.getInstance();
		System.out.println(s1);
}
	
	
	public static void main(String[] args) {
		//开启1000个线程来调用getInstance()方法，发现返回的instance并不只一个，所以不是线程安全的（多试几次）
		for(int i = 0;i < 1000;i++){
			TestSingleton1 t = new TestSingleton1();
			t.start();
		}
	}
}
