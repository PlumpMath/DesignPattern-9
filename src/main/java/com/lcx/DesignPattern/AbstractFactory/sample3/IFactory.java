package com.lcx.DesignPattern.AbstractFactory.sample3;

public interface IFactory {
	public abstract IUser createUser();
	public abstract IDepartment createDepartment();
}
