package com.lcx.DesignPattern.Builder.sample1;

/**
 * 建造的指挥者<br/>
 * 用来控制建造的过程<br/>
 * 隔离用户与建造过程
 * @author LCX
 * @date 2013-7-28 上午11:29:52
 */
public class PersonDirector {
	private PersonBuilder pb;
	public PersonDirector() {}
	public PersonDirector(PersonBuilder pb) {
		this.pb = pb;
	}
	public void createPerson() {
		pb.buildHead();
		pb.buildBody();
		pb.buildLeftArm();
		pb.buildRightArm();
		pb.buidlLeftLeg();
		pb.buildRightLeg();
	}
}
