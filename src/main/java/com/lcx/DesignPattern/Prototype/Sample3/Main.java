package com.lcx.DesignPattern.Prototype.Sample3;

/**
 * 由于是浅表复制，对于值类型没问题，但是对引用类型，就是引用复制了，对引用的对象还是指向了原来的对象，所以
 * 给resume1、2、3三个引用的工作经历，所以设置工作经历的时候，最后看见的是第三次修改的
 * @author 李晨星
 * @date 2013-7-23 上午11:53:53
 */
public class Main {
	public static void main(String[] args) {
		Resume resume1 = new Resume("李晨星");
		resume1.setPersonInfo("man", "22");
		resume1.setWorkExperience("2013年4月10日-至今", "金软瑞彩");
		Resume resume2 = resume1.clone();
		resume2.setWorkExperience("2013年4月10日-至今", "金软瑞彩1");
		Resume resume3 = resume1.clone();
		resume3.setWorkExperience("2013年4月10日-至今", "金软瑞彩2");
		resume1.display();
		resume2.display();
		resume3.display();
	}
}
