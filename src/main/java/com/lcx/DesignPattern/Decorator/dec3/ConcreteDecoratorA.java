package com.lcx.DesignPattern.Decorator.dec3;

/**
 * 装饰A <br/>
 * 继承装饰抽象类
 * @author 李晨星
 * @date 2013-7-22 下午3:40:26
 */
public class ConcreteDecoratorA extends Decorator {

	//本类独有的功能
	private String addedState;
	
	public void operation() {
		super.operation();
		addedState = "new state";
		System.out.println("具体装饰对象A的操作" + addedState);
	}
}
