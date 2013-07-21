package com.lcx.DesignPattern.Decorator.dec3;

public class ConcreteDecoratorA extends Decorator {

	//本类独有的功能
	private String addedState;
	
	public void operation() {
		super.operation();
		addedState = "new state";
		System.out.println("具体装饰对象A的操作" + addedState);
	}
}
