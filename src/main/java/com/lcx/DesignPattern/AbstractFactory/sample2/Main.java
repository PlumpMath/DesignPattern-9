package com.lcx.DesignPattern.AbstractFactory.sample2;

public class Main {

	/**
	 * 基于工厂方法的
	 * P162
	 * @param args
	 */
	public static void main(String[] args) {
		IFactory factory = new SqlServerFactory();
		IUser iu = factory.createUser();
		iu.insert(new User(1, "李晨星"));
		iu.select(1);
	}

}
