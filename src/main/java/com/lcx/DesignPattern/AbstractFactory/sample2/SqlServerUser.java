package com.lcx.DesignPattern.AbstractFactory.sample2;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在SQL Server中给User表增加一条记录" + user.getId() + user.getName());
	}

	@Override
	public User select(Integer id) {
		System.out.println("从SQL Server中查找" + id);
		return null;
	}

}
