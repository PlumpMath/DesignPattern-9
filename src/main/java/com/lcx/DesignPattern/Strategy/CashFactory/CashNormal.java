package com.lcx.DesignPattern.Strategy.CashFactory;

/**
 * 正常收费
 * @author LCX
 * @date 2013-7-21 下午1:04:57
 */
public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
