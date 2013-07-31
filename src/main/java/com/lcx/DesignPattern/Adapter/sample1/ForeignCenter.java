package com.lcx.DesignPattern.Adapter.sample1;

/**
 * 外国中锋
 * 
 * @author 李晨星
 * @date 2013-7-31 下午4:36:20
 */
public class ForeignCenter {

	private String name;
	
	public ForeignCenter() {}
	
	public ForeignCenter(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println("外籍中锋" + name + " 进攻");
	}

	public void defense() {
		System.out.println("外籍中锋" + name + "防守");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
