package com.lcx.DesignPattern.Prototype.Sample1;

public class ConcretePrototype1 implements Cloneable {
	
	private String id;
	
	public ConcretePrototype1(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}

	public ConcretePrototype1 myClone() {
		ConcretePrototype1 cp1 = null;	
		try {
			cp1 = (ConcretePrototype1) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cp1;
	}

}
