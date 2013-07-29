package com.lcx.DesignPattern.AbstractFactory.sample1;

public class SqlServerUser {
	public void insert(User user) {
		System.out.println("在SQL Server中给User表增加一条记录" + user.getId() + user.getName());
	}
	public User select(Integer id) {
		System.out.println("从SQL Server中查找" + id);
		return null;
	}
}
