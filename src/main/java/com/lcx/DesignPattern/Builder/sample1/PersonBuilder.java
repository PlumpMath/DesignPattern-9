package com.lcx.DesignPattern.Builder.sample1;

/**
 * 抽象的建造人的类
 * @author LCX
 * @date 2013-7-28 上午11:24:35
 */
public abstract class PersonBuilder {
	
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildLeftArm();
	public abstract void buildRightArm();
	public abstract void buidlLeftLeg();
	public abstract void buildRightLeg();
}
