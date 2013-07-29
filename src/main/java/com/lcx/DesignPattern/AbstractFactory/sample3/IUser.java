package com.lcx.DesignPattern.AbstractFactory.sample3;

public interface IUser {
	public abstract void insert(User user);
	public abstract User select(Integer id);
}
