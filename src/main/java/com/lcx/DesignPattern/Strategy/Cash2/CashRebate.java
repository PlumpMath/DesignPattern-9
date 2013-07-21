package com.lcx.DesignPattern.Strategy.Cash2;

import java.math.BigDecimal;

/**
 * 打折收费
 * @author LCX
 * @date 2013-7-21 下午1:07:14
 */
public class CashRebate extends CashSuper {
	
	private BigDecimal moneyRebate;
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = new BigDecimal(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return moneyRebate.multiply(new BigDecimal(money)).doubleValue();
	}

}
