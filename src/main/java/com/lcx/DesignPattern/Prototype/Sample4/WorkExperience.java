package com.lcx.DesignPattern.Prototype.Sample4;

public class WorkExperience implements Cloneable {
	private String timeArea;
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	
	public WorkExperience clone() {
		WorkExperience we = null;
		try {
			we = (WorkExperience) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return we;
	}
}
