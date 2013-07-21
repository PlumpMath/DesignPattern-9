package com.lcx.DesignPattern.Decorator.dec4;

/**
 * 人类
 * 
 * 相当于dec3的ConcreteComponent
 * 由于只有一个，所以省略了Component
 * @author LCX
 * @date 2013-7-21 下午5:56:20
 */
public class Person {
	
	private String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("装扮的" + name);
	}
}
