package com.lcx.DesignPattern.Prototype.Sample4;


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
