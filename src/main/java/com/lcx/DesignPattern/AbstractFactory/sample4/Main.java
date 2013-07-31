package com.lcx.DesignPattern.AbstractFactory.sample4;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User(1, "lcx");
		Department dept = new Department(1, "ryc");
		
		DataAccess.setDbDriver(DatabaseDriver.Access);
		
		IUser iu = DataAccess.createUser();
		IDepartment id =DataAccess.createDepartment();
		
		iu.insert(user);
		iu.select(1);
		
		id.insert(dept);
		id.select(1);
	}

}
