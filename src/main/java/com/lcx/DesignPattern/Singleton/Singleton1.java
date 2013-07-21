package com.lcx.DesignPattern.Singleton;

/**
 * 简单的懒汉模式
 * @author LCX
 *
 * 在多线程时不安全
 * 当两个线程同时进入 if(instance == null) 时，两个线程都判空，会产生两个实例
 */
public class Singleton1 {
	
	//单例实例变量
	private static Singleton1 instance = null;
	
	//构造函数 私有化方法 保证外部不能通过构造器实例化
	private Singleton1() {
		System.out.println(Thread.currentThread().getName() + "#Singleton1的构造函数");
	}
	
	//获得单例实例对象
	public static Singleton1 getInstance () {
		if (instance == null) {
			instance = new Singleton1();
		}
		System.out.println("我是简单懒汉式单例！");  
		return instance;
	}
}
