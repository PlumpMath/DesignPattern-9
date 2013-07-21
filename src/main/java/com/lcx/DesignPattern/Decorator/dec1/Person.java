package com.lcx.DesignPattern.Decorator.dec1;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void wearTshirts() {
		System.out.print(" 穿T恤");
	}
	public void wearSuit() {
		System.out.print(" 穿西服");
	}
	public void wearPants() {
		System.out.print(" 穿裤子");
	}
	public void wearJeans() {
		System.out.print(" 穿牛仔裤");
	}
	public void show() {
		System.out.println("装扮的" + name);
	}
}
