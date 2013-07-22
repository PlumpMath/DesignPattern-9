package com.lcx.DesignPattern.Decorator.dec3;

/**
 * 装饰B <br/>
 * 继承装饰抽象类
 * @author 李晨星
 * @date 2013-7-22 下午3:40:48
 */
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
