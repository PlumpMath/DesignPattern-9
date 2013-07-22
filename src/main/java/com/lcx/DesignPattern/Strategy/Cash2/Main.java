package com.lcx.DesignPattern.Strategy.Cash2;

public class Main {

	/**
	 * 收银的策略模式
	 */
	public static void main(String[] args) {
		CashContext cc = new CashContext(new CashReturn(100, 50));
		double result = cc.getResult(400);
		System.out.println(result);
		
		
	}

}
