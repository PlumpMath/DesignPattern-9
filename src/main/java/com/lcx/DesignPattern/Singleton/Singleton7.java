package com.lcx.DesignPattern.Singleton;

public enum Singleton7 {
	INSTANCE,INSTANCE2;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Singleton7() {
		System.out.println("枚举类型的单例模式的构造函数");
	}

	public void foo1() {
		System.out.println("foo1" + name);
	}

	public void foo2() {
		System.out.println("foo2" + name);
	}

	public void foo3() {
		System.out.println("foo3" + name);
	}

}
