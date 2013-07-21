package com.lcx.DesignPattern.Decorator.dec2;

/**
 * 面向对象的穿衣服
 * 不足就是在众目睽睽之下穿衣服
 * @author LCX
 * @date 2013-7-21 下午4:17:36
 */
public class Main {
	
	public static void main(String[] args) {
		Person person = new Person("李晨星");
		Finery bt = new BigTrouser();
		Finery su = new Suits();
		Finery ts = new TShirts();
		
		System.out.println("第一种装扮");
		bt.show();
		ts.show();
		person.show();
		System.out.println("第二种装扮");
		su.show();
		person.show();
	}

}
