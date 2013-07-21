package com.lcx.DesignPattern.Decorator.dec3;

public class ConcreteDecoratorB extends Decorator {
	
	public void operation() {
		super.operation();
		addBehavior();
		System.out.println("装饰B的具体操作");
	}
	
	//本类具有的特殊操作
	private void addBehavior() {
		System.out.println("增加行为");
	}
}
