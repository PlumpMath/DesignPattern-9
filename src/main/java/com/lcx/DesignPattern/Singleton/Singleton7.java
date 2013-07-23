package com.lcx.DesignPattern.Singleton;

/**
 * 枚举方式解决单例
 * @author 李晨星
 * @date 2013-7-23 上午9:25:58
 */
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
