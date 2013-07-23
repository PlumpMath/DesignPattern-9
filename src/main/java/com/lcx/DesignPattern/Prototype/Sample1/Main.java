package com.lcx.DesignPattern.Prototype.Sample1;

/**
 * 克隆简单例子
 * @author 李晨星
 * @date 2013-7-23 上午11:59:20
 */
public class Main {
	public static void main(String[] args) {
		ConcretePrototype1 cp = new ConcretePrototype1("lcx");
		ConcretePrototype1 cp2 = (ConcretePrototype1) cp.myClone();
		ConcretePrototype1 cp3 = cp;
		System.out.println(cp2.getId());
		System.out.println(cp);
		System.out.println(cp2);
		System.out.println(cp3);
		
	}

}
