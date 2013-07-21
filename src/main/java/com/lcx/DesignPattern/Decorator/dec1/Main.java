package com.lcx.DesignPattern.Decorator.dec1;

/**
 * 面向过程的穿衣服
 * @author LCX
 * @date 2013-7-21 下午5:28:45
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person("李晨星");
		person.wearJeans();
		person.wearTshirts();
		person.show();
		person.wearSuit();
		person.show();
	}

}
