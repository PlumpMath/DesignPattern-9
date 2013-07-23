package com.lcx.DesignPattern.Singleton;

/**
 * Double-Checked Locking <br/>
 * As of JDK5, there is a new Java Memory Model and Thread specification.Fixing Double-Checked Locking using Volatile. <br/>
 * J2SE1.4和以前版本不支持该方法
 * @author 李晨星
 * @date 2013-7-23 上午9:23:55
 */
public class Singleton8 {
	private static volatile Singleton8 instance = null;
	
	private Singleton8() {
		System.out.println(Thread.currentThread().getName() + "#Singleton8的构造函数");
	}
	
	public static Singleton8 getInstance() {
		if(instance == null) {
			synchronized(Singleton8.class) {
				if(instance == null) {
					instance = new Singleton8();
				}
			}
		}
		System.out.println("我是双重锁定懒汉式单例！");
		return instance;
	}
}
