package com.lcx.DesignPattern.TemplateMethod.sample;

public class ConcreteClassB extends AbstractClass {

	@Override
	public void operation1() {
		System.out.println("具体实现类B的方法1");
	}

	@Override
	public void operation2() {
		System.out.println("具体实现类B的方法2");
	}

}
