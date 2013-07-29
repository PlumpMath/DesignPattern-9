package com.lcx.DesignPattern.AbstractFactory.sample3;

public interface IDepartment {
	public abstract void insert(Department department);
	public abstract Department select(Integer id);
}
