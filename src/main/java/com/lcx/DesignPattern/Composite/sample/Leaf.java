package com.lcx.DesignPattern.Composite.sample;

public class Leaf extends Component {
	
	public Leaf() {}
	
	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Can not add to a leaf.");
	}

	@Override
	public void remove(Component c) {
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

}
