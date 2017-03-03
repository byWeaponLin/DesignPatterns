package com.weaponlin.Singleton;

public class TestSingleton2 extends Thread{
	public static Singleton2 instance = null;
	
	@Override
	public void run() {
		instance = Singleton2.getInstance();
	}

	public static void main(String[] args) {
		//可以发现，还是创建了不止一个实例（可以多试几次）
		for(int i=0;i < 2000;i++){
			TestSingleton2 t = new TestSingleton2();
			t.start();
		}
	}
}
