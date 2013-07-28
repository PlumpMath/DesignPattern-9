package com.lcx.DesignPattern.TemplateMethod.sample;

public abstract class AbstractClass {
	//抽象行为放到子类
	public abstract void operation1();

	public abstract void operation2();

	//模版方法，给出了逻辑的框架，而逻辑的组成是一些抽象操作，他们都推迟到子类实现
	public void templateMethod() {
		operation1();
		operation2();
	}
}
