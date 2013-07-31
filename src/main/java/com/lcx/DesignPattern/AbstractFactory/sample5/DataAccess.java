package com.lcx.DesignPattern.AbstractFactory.sample5;

public class DataAccess {
	private static String assemblyName = "com.lcx.DesignPattern.AbstractFactory.sample5";
	private static String db = "SqlServer";
	
	public static IUser createUser() {
		IUser user = null;
		try {
			Class<?> userClass = Class.forName(assemblyName + "." + db + "User");
			user = (IUser) userClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return user;
	}
}
