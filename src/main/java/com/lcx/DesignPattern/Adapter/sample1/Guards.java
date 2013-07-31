package com.lcx.DesignPattern.Adapter.sample1;

/**
 * 后卫
 * @author 李晨星
 * @date 2013-7-31 下午4:27:42
 */
public class Guards extends Player {
	
	public Guards() {}
	
	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Guards " + getName() + " attack");
	}

	@Override
	public void defense() {
		System.out.println("Gurads " + getName() + " defense");
	}

}
