package com.lcx.DesignPattern.Composite.sample1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
	
	private List<Company> children = new ArrayList<Company>();
	
	public ConcreteCompany() {}
	
	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		String tree = "";
		for(int i = 0; i < depth; i++) {
			tree += "-";
		}
		System.out.println(tree + name);
		for(Company child : children) {
			child.display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {
		for(Company child : children) {
			child.lineOfDuty();
		}
	}

}
