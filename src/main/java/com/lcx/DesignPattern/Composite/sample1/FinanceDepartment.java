package com.lcx.DesignPattern.Composite.sample1;

/**
 * 财务部门树叶节点
 * @author 李晨星
 * @date 2013-8-1 下午4:28:18
 */
public class FinanceDepartment extends Company {
	
	public FinanceDepartment() {}
	
	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		System.out.println("Can not add to a leaf.");
	}

	@Override
	public void remove(Company c) {
		System.out.println("Can not remove from a leaf.");
	}

	@Override
	public void display(int depth) {
		String tree = "";
		for(int i = 0; i < depth; i++) {
			tree += "-";
		}
		System.out.println(tree + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + "公司财务收支管理");
	}

}
