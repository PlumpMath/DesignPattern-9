package com.lcx.DesignPattern.singleton;

/**
 * 同步法懒汉模式
 * @author LCX
 *
 * 加上synchronized了以后保证了线程安全
 * 但由于每次调用getInstance的时候方法都会被枷锁
 * 而我们只需要在第一次调用getInstance的时候加锁就可以了
 * 这显然影响了我们程序的性能
 */
public class Singleton2 {
	
	//单例实例变量
	private static Singleton2 instance = null;
	
	//构造函数 私有化方法 保证外部不能通过构造器实例化
	private Singleton2() {
		System.out.println(Thread.currentThread().getName() + "#Singleton2的构造函数");
	}
	
	//获得单例实例对象
	public static synchronized Singleton2 getInstance () {
		if (instance == null) {
			instance = new Singleton2();
		}
		System.out.println("我是同步法懒汉式单例！"); 
		return instance;
	}
}
