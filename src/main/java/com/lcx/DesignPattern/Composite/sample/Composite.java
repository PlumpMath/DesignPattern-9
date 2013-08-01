package com.lcx.DesignPattern.Composite.sample;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	public Composite() {}
	
	public Composite(String name) {
		super(name);
	}
	
	private List<Component> children = new ArrayList<Component>();

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		String tree = "";
		for(int i = 0; i < depth; i++) {
			tree += "-";
		}
		System.out.println(tree + name);
		for(Component child : children) {
			child.display(depth + 2);
		}
	}

}
