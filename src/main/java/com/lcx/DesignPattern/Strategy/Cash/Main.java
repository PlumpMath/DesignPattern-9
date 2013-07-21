package com.lcx.DesignPattern.Strategy.Cash;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CashSuper cashSuper = CashFactory.createCashAccept(CashType.Return, null, 300.0, 100.0);
		double result = cashSuper.acceptCash(700);
		System.out.println(result);
	}

}
