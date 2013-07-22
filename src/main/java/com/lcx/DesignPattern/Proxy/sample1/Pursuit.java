package com.lcx.DesignPattern.Proxy.sample1;

/**
 * 追求类者
 * @author LCX
 * @date 2013-7-22 下午9:32:06
 */
public class Pursuit implements GiveGift {
	
	private SchoolGirl schoolGirl;
	
	public Pursuit(SchoolGirl schoolGirl) {
		this.schoolGirl = schoolGirl;
	}

	public void giveDolls() {
		System.out.println(schoolGirl.getName() + "，送你洋娃娃~");
	}

	public void giveFlowers() {
		System.out.println(schoolGirl.getName() + "，送你花~");
	}

	public void giveChocolate() {
		System.out.println(schoolGirl.getName() + "，送你巧克力~");
	}

}
