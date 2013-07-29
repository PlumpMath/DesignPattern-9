package com.lcx.DesignPattern.AbstractFactory.sample1;

public class Main {

	/**
	 * 最近本的数据访问程序
	 * @param args
	 */
	public static void main(String[] args) {
		SqlServerUser squ = new SqlServerUser();
		squ.insert(new User(1,"李晨星"));
		squ.select(1);
	}

}
