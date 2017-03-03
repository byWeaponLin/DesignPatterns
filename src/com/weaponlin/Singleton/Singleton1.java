package com.weaponlin.Singleton;

/**
 * version1.1
 * @author Weapon Lin
 *
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	
	private Singleton1(){
		
	}
	
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		
		return instance;
	}
}
