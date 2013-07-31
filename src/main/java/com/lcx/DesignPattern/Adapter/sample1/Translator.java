package com.lcx.DesignPattern.Adapter.sample1;

public class Translator extends Player {
	
	private ForeignCenter foreignCenter = new ForeignCenter();
	
	public Translator() {}
	
	public Translator(String name) {
		foreignCenter.setName(name);
	}

	@Override
	public void attack() {
		foreignCenter.attack();
	}

	@Override
	public void defense() {
		foreignCenter.defense();
	}

}
