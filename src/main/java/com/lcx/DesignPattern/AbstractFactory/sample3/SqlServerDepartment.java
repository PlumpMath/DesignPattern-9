package com.lcx.DesignPattern.AbstractFactory.sample3;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在SqlServer中给Department表增加记录");
	}

	@Override
	public Department select(Integer id) {
		System.out.println("在SqlServer中根据id得到Department的一条记录");
		return null;
	}

}
