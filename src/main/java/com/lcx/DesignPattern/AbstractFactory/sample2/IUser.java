package com.lcx.DesignPattern.AbstractFactory.sample2;

public interface IUser {
	public abstract void insert(User user);
	public abstract User select(Integer id);
}
