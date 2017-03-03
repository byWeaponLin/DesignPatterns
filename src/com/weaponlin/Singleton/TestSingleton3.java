package com.weaponlin.Singleton;

public class TestSingleton3 extends Thread{
	private static Singleton3 instance = null;
	@Override
	public void run() {
		instance = Singleton3.getInstance();
	}
	
	public static void main(String[] args) {
		for(int i=0;i < 1000;i++){
			TestSingleton3 t = new TestSingleton3();
			t.start();
		}
		for(int i=0;i < 1000;i++){
			TestSingleton3 t = new TestSingleton3();
			t.start();
		}
		for(int i=0;i < 1000;i++){
			TestSingleton3 t = new TestSingleton3();
			t.start();
		}
	}
}
