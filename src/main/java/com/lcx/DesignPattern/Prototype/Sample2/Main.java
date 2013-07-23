package com.lcx.DesignPattern.Prototype.Sample2;

/**
 * 克隆<br/>
 * 由于是浅表复制，对于值类型没问题，但是对引用类型，就是引用复制了，对引用的对象还是指向了原来的对象。
 * @author 李晨星
 * @date 2013-7-23 上午11:54:01
 */
public class Main {

	public static void main(String[] args) {
		Resume a = new Resume("李晨星");
		a.setPersonalInfo("man", "22");
		a.setWorkExperience("2013年4月10日-至今", "金软瑞彩");
		a.display();
		Resume b = a.clone();
		b.setPersonalInfo("man", "23");
		b.display();
	}

}
