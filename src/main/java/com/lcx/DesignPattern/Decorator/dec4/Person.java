package com.lcx.DesignPattern.Decorator.dec4;

/**
 * 人类 <br/>  
 * 相当于dec3的ConcreteComponent <br/> 
 * 由于只有一个尸体“人类”，所以省略了Component抽象类 <br/> 
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
