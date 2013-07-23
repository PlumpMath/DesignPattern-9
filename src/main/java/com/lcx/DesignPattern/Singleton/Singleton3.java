package com.lcx.DesignPattern.Singleton;

/**
 * 双重检查锁定懒汉式   
 * 由于Java平台内存模型的“无序写”（out-of-order writes）会导致双重检查加锁模式失效
 * 问题在instance = new Singleton3(); 这里做了两个事情：
 * 		1、调用构造方法创建一个Singleton3的实例
 * 		2、把这个实例赋值给instance
 * 但是JVM是不能保证其顺序的，也就是说在调用构造方法之前，instance已经被设置为非空了
 * 
 * 假设有两个线程A、B
 * 1、线程A进入getInstance()方法。
 * 2、因为此时instance为空，所以线程A进入synchronized块。
 * 3、线程A执行 instance = new Singleton(); 把实例变量instance设置成了非空。（注意，是在调用构造方法之前。）
 * 4、线程A退出，线程B进入。
 * 5、线程B检查instance是否为空，此时不为空（第三步的时候被线程A设置成了非空）。
 *      线程B返回instance的引用。（问题出现了，这时instance的引用并不是Singleton的实例，因为没有调用构造方法。） 
 * 6、线程B退出，线程A进入。
 * 7、线程A继续调用构造方法，完成instance的初始化，再返回。 
 * @author LCX
 */
public class Singleton3 {
	
	private static Singleton3 instance = null;
	
	private Singleton3() {
		System.out.println(Thread.currentThread().getName() + "#Singleton3的构造函数");
	}
	
	public static Singleton3 getInstance() {
		if(instance == null) {
			synchronized(Singleton3.class) {
				if(instance == null) {
					instance = new Singleton3();
				}
			}
		}
		System.out.println("我是双重检查锁定懒汉式单例！");
		return instance;
	}
}
