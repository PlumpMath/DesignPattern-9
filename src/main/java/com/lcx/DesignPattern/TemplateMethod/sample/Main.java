package com.lcx.DesignPattern.TemplateMethod.sample;

/**
 * P114
 * @author LCX
 * @date 2013-7-28 上午10:33:56
 */
public class Main {

	public static void main(String[] args) {
		AbstractClass c;
		c = new ConcreteClassA();
		c.templateMethod();
		c = new ConcreteClassB();
		c.templateMethod();
	}

}
