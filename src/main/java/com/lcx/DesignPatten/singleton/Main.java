package com.lcx.DesignPatten.singleton;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton6 instance = null;
		instance = Singleton6.getInstance();
		instance.saySomething();

		Singleton7 instance1 = Singleton7.INSTANCE;
		Singleton7 instance2 = Singleton7.INSTANCE2;
		Singleton7 instance3= Singleton7.INSTANCE;
		instance1.setName("lcx");
		instance1.foo1();
		instance2.foo1();
		instance3.foo1();

	}

}
