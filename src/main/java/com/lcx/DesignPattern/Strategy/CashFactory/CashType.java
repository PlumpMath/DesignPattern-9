package com.lcx.DesignPattern.Strategy.CashFactory;

/**
 * 收费方式枚举类
 * @author LCX
 * @date 2013-7-21 下午1:25:55
 */
public enum CashType {
	Normal(1),Rebate(2),Return(3);
	public int value;
	private CashType(int value) {
		this.value = value;
	}
}
