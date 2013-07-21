package com.lcx.DesignPattern.Decorator.dec4;

public class Suits extends Finery {
	@Override
	public void show() {
		System.out.print("西服");
		super.show();
	}
}
