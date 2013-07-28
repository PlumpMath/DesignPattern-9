package com.lcx.DesignPattern.Builder.sample1;

public class FatPersonBuilder extends PersonBuilder {

	@Override
	public void buildHead() {
		System.out.println("建造脑袋");
	}

	@Override
	public void buildBody() {
		System.out.println("建造身体");
	}

	@Override
	public void buildLeftArm() {
		System.out.println("建造左胳膊");
	}

	@Override
	public void buildRightArm() {
		System.out.println("建造右胳膊");
	}

	@Override
	public void buidlLeftLeg() {
		System.out.println("建造左腿");
	}

	@Override
	public void buildRightLeg() {
		System.out.println("建造右腿");
	}

}
