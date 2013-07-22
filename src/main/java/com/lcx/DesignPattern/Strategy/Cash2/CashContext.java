package com.lcx.DesignPattern.Strategy.Cash2;

public class CashContext {
	
	private CashSuper cashSuper;
	
	public CashContext(CashSuper cashType) {
		this.cashSuper = cashType;
	}
	
	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}
}
