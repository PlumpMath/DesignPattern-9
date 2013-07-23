package com.lcx.DesignPattern.Prototype.Sample3;



public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	public void setPersonInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	public void setWorkExperience(String timeArea, String company) {
		this.work.setCompany(company);
		this.work.setTimeArea(timeArea);
	}
	public void display() {
		System.out.println(name + "  " + sex + "  " + age);
		System.out.println(work.getTimeArea() + "  " + work.getCompany());
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
