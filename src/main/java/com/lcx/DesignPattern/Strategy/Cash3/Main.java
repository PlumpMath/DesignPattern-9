package com.lcx.DesignPattern.Strategy.Cash3;

public class Main {

	/**
	 * 策略模式例子
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStrategyA());
		context.contextInterfate();
	}

}
