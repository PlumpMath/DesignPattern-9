package com.lcx.DesignPattern.AbstractFactory.sample4;

public class DataAccess {
	private static DatabaseDriver dbDriver = DatabaseDriver.SqlServer;
	public static IUser createUser() {
		switch (dbDriver) {
		case SqlServer:
			return new SqlServerUser();
		case Access:
			return new AccessUser();
		default:
				return null;
		}
	}
	public static IDepartment createDepartment() {
		switch (dbDriver) {
		case SqlServer:
			return new SqlServerDepartment();
		case Access:
			return new AccessDepartment();
		default:
				return null;
		}
	}
		
}
