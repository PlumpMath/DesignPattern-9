package com.lcx.DesignPattern.Prototype.Sample2;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	public Resume(String name) {
		this.name = name;
	}
	//设置跟人信息
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	
	//设置工作经历
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}
	
	//显示
	public void display() {
		System.out.println(name + "  " + sex + "  " + age);
		System.out.println(timeArea + "  " + company);
	}
	
	public Resume clone() {
		Resume resume = null;
		try {			
			resume = (Resume) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return resume;
	}
}
