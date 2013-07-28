package com.lcx.DesignPattern.Builder.sample;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		
		Builder b1 = new ConcreteBuilder1();	//创建一个具体的建造者
		director.construct(b1);	//指挥类开始装配
		Product p1 = b1.getResult();	//返回装配完毕的产品
		p1.show();
		

		Builder b2 = new ConcreteBuilder2();
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
	}

}
