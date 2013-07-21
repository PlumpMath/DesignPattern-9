package com.lcx.DesignPattern.singleton;

/**
 * 解决无序写入的尝试
 * @author LCX
 * 不过该代码并没有解决问题
 * 这里的关键行是 //5。此行应该确保 instance 只为 null 或引用一个构造完整的 Singleton4 对象。
 * 该问题发生在理论和实际彼此背道而驰的情况下。
 * 由于当前内存模型的定义，代码无效。
 * Java 语言规范（Java Language Specification，JLS）要求不能将 synchronized 块中的代码移出来。
 * 但是，并没有说不能将 synchronized 块外面的代码移入 synchronized 块中。
 * JIT 编译器会在这里看到一个优化的机会。此优化会删除 //4 和 //5 处的代码，组合并且生成getInstance2所示的代码
 * 如果进行此项优化，您将同样遇到我们之前讨论过的无序写入问题。
 */
public class Singleton4 {

	private static Singleton4 instance = null;

	private Singleton4() {
		System.out.println(Thread.currentThread().getName() + "#Singleton4的构造函数");
	}
	
	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized(Singleton4.class) {      //1
				Singleton4 inst = instance;         //2
				if (inst == null) {
					synchronized(Singleton4.class) {  //3
						inst = new Singleton4();        //4
					}
					instance = inst;                 //5
				}
			}
		}
		return instance;
	}
	
	public static Singleton4 getInstance2() {
		if (instance == null) {
			synchronized(Singleton4.class) {      //1
				Singleton4 inst = instance;         //2
				if (inst == null) {
					synchronized(Singleton4.class) {  //3
						//inst = new Singleton();      //4
						instance = new Singleton4();               
					}
					//instance = inst;               //5
				}
			}
		}
		return instance;
	}
}
