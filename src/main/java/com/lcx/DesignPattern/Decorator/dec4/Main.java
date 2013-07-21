package com.lcx.DesignPattern.Decorator.dec4;

/**
 * 装饰模式的穿衣服
 * @author LCX
 * @date 2013-7-21 下午5:29:54
 */
public class Main {

	public static void main(String[] args) {
		Person person = new Person("李晨星");
		BigTrouser bt = new BigTrouser();
		Suits sui = new Suits();
		TShirts ts = new TShirts();
		System.out.println("第一种装扮");
		bt.decorate(person);
		ts.decorate(bt);
		ts.show();
	}

}
