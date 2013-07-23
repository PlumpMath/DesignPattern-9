package com.lcx.DesignPattern.Builder;

public class Director {
	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
