package com.lcx.DesignPattern.Adapter.sample;

public class Main {

	/**
	 * P190
	 */
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}

}
