package com.lcx.DesignPattern.singleton;

/**
 * 饿汉模式的单例
 * @author LCX
 *
 */
public class Singleton5 {
	
	private static Singleton5 instance = new Singleton5();
	
	private Singleton5() {
		System.out.println(Thread.currentThread().getName() + "#Singleton5的构造函数");
	}
	
	public static Singleton5 getInstance() {
		System.out.println("我是饿汉式单例！");  
		return instance;
	}
}
