package com.lcx.DesignPattern.Strategy.Cash2;

public class Main {

	/**
	 * 策略模式
	 * 客户端只用引用CashContext，解耦和。
	 */
	public static void main(String[] args) {
		CashContext cc = new CashContext(CashType.Rebate, 0.8, null, null);
		double result = cc.getResult(100);
		System.out.println(result);
		
		
	}

}
