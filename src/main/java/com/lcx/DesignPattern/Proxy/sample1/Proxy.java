package com.lcx.DesignPattern.Proxy.sample1;

/**
 * 代理类
 * @author LCX
 * @date 2013-7-22 下午9:37:10
 */
public class Proxy implements GiveGift {
	
	private Pursuit pursuit;
	
	public Proxy(SchoolGirl schoolGirl) {
		this.pursuit = new Pursuit(schoolGirl);
	}

	public void giveDolls() {
		pursuit.giveDolls();
	}

	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	public void giveChocolate() {
		pursuit.giveChocolate();
	}

}
