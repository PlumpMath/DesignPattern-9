package com.lcx.DesignPattern.Decorator.dec3;

/**
 *	装饰模式举例 
 *
 *  首先是ConcreteComponent实例化对象cc
 *  然后用ConcreteDecoratorA实例化cda 然后用cda装饰cc
 *  然后再用ConcreteDecoratorB实例化cdb 然后用cdb装饰cda
 *  最终执行cdb的operation()
 * @author LCX
 * @date 2013-7-21 下午5:29:33
 */
public class Main {
	public static void main(String[] args) {
		
		ConcreteComponent cc = new ConcreteComponent();
		ConcreteDecoratorA cda = new ConcreteDecoratorA();
		ConcreteDecoratorB cdb = new ConcreteDecoratorB();
		
		cda.setComponent(cc);
		cdb.setComponent(cda);
		cdb.operation();
	}

}
