package com.lcx.DesignPattern.Adapter.sample1;

/**
 * 前锋
 * @author 李晨星
 * @date 2013-7-31 下午4:26:41
 */
public class Forward extends Player {
	
	public Forward() {}
	
	public Forward(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Forward " + getName() + "attack");
	}

	@Override
	public void defense() {
		System.out.println("Forward " + getName() + " defense");
	}

}
