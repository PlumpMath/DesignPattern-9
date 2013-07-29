package com.lcx.DesignPattern.AbstractFactory.sample2;

public class SqlServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new SqlServerUser();
	}

}
