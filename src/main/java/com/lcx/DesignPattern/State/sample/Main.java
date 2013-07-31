package com.lcx.DesignPattern.State.sample;

public class Main {

	/**
	 * P182
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStateA());
		context.resquest();
		context.resquest();
		context.resquest();
		context.resquest();
	}

}
