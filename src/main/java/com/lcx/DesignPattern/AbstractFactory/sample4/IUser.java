package com.lcx.DesignPattern.AbstractFactory.sample4;

public interface IUser {
	public abstract void insert(User user);
	public abstract User select(Integer id);
}
