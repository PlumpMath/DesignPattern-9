package com.lcx.DesignPattern.AbstractFactory.sample3;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在Access中给User表增加一条记录" + user.getId() + user.getName());
	}

	@Override
	public User select(Integer id) {
		System.out.println("从Access中查找" + id);
		return null;
	}

}
