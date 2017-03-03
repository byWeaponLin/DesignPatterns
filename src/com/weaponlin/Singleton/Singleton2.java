package com.weaponlin.Singleton;

/**
 * version1.2
 * @author Weapon Lin
 *
 */
public class Singleton2 {
	private static Singleton2 instance = null;
	public static int i =0;
	private Singleton2(){};
	
	public static Singleton2 getInstance(){
		if(instance == null){
			synchronized (Singleton2.class) {
				instance = new Singleton2();
				System.out.println(instance);
			}
		}
		return instance;
	}
}
