package com.lcx.DesignPattern.Proxy.sample1;

/**
 * 学校的女生
 * @author LCX
 * @date 2013-7-22 下午9:33:08
 */
public class SchoolGirl {
	private String name;
	
	public SchoolGirl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
