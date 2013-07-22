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
		
		ConcreteComponent cc = new ConcreteComponent();	//比如是一个人
		ConcreteDecoratorA cda = new ConcreteDecoratorA();	//装饰a
		ConcreteDecoratorB cdb = new ConcreteDecoratorB();	//装饰b
		
		cda.setComponent(cc);		//用装饰a装饰人
		cdb.setComponent(cda);	//用装饰b装饰已经装饰了a的人
		cdb.operation();
	}

}
