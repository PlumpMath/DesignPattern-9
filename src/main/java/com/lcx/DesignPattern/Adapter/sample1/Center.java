package com.lcx.DesignPattern.Adapter.sample1;

/**
 * 中锋
 * @author 李晨星
 * @date 2013-7-31 下午4:26:48
 */
public class Center extends Player {

	@Override
	public void attack() {
		System.out.println("Center " + getName() + " attack");
	}

	@Override
	public void defense() {
		System.out.println("Center " + getName() + " defense");
	}

}
