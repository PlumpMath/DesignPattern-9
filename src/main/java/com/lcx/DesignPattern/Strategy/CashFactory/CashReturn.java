package com.lcx.DesignPattern.Strategy.CashFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 返利收费
 * @author LCX
 * @date 2013-7-21 下午1:07:56
 */
public class CashReturn extends CashSuper {
	
	private BigDecimal moneyCondition;
	private BigDecimal moneyReturn;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = new BigDecimal(moneyCondition);
		this.moneyReturn = new BigDecimal(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		BigDecimal cash = new BigDecimal(money);
		int times = cash.divide(moneyCondition, RoundingMode.DOWN).intValue();
		double result = moneyReturn.multiply(new BigDecimal(times)).doubleValue();
		return result;
	}

}
