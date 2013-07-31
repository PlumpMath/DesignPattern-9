package com.lcx.DesignPattern.AbstractFactory.sample5;

public class Main {

	/**
	 * 运用反射的抽象工厂
	 * @param args
	 */
	public static void main(String[] args) {
		IUser iu = DataAccess.createUser();
		iu.select(1);
	}

}
