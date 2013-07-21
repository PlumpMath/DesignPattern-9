package com.lcx.DesignPattern.Singleton;

/**
 * 内部类实现懒汉模式
 * @author LCX
 *
 */
public class Singleton6 {
	
	private static class SingletonHoler {
		private static Singleton6 instance = new Singleton6();
	}
	
	private Singleton6() {
		System.out.println(Thread.currentThread().getName() + "#Singleton6的构造函数");
	}
	
	public static Singleton6 getInstance() {
		System.out.println("我是内部类单例！");  
		return SingletonHoler.instance;
	}
	
	public void saySomething() {
		System.out.println("我是内部类实现懒汉模式");
	}
}
