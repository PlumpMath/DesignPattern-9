package com.lcx.DesignPattern.AbstractFactory.sample3;


public class Main {

	/**
	 * 用了抽象工厂的
	 * P164
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User(1, "lcx");
		Department deparment = new Department(1, "lm");
		
		IFactory factory = new SqlServerFactory();
//		IFactory factory = new  AccessFactory();
		
		IUser iuser = factory.createUser();
		iuser.insert(user);
		iuser.select(1);
		
		IDepartment id = factory.createDepartment();
		id.insert(deparment);
		id.select(1);

	}

}
