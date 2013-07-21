package com.lcx.DesignPattern.Strategy.Cash2;

public class CashContext {
	
	private CashSuper cashSuper;
	
	public CashContext(CashType cashType, Double rebate, Double conditionmoney, Double returnmoney) {
		switch (cashType) {
		case Normal:
			cashSuper = new CashNormal();
			break;
		case Rebate:
			cashSuper = new CashRebate(rebate);
			break;
		case Return:
			cashSuper = new CashReturn(conditionmoney, returnmoney);
			break;
		default:
			break;
		}
	}
	
	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}
}
