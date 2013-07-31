package com.lcx.DesignPattern.AbstractFactory.sample4;

public class DataAccess {
	private static DatabaseDriver dbDriver = DatabaseDriver.SqlServer;
	public static IUser createUser() {
		switch (getDbDriver()) {
		case SqlServer:
			return new SqlServerUser();
		case Access:
			return new AccessUser();
		default:
				return null;
		}
	}
	public static IDepartment createDepartment() {
		switch (getDbDriver()) {
		case SqlServer:
			return new SqlServerDepartment();
		case Access:
			return new AccessDepartment();
		default:
				return null;
		}
	}
	public static DatabaseDriver getDbDriver() {
		return dbDriver;
	}
	public static void setDbDriver(DatabaseDriver dbDriver) {
		DataAccess.dbDriver = dbDriver;
	}
		
}
