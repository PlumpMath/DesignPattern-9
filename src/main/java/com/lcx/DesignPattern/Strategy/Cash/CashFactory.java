package com.lcx.DesignPattern.Strategy.Cash;

/**
 * 收费工厂
 * @author LCX
 * @date 2013-7-21 下午1:25:09
 */
public class CashFactory {
	/**
	 * 创建收费类
	 * @param type							收费方式
	 * @param rebate						打折百分比	如果type是rebate不能为空
	 * @param moneyCondition		基本金		如果type是normal不能为空
	 * @param moneyReturn			返奖金额		如果type是normal不能为空
	 * @return
	 */
	public static CashSuper createCashAccept(CashType type, Double rebate, Double moneyCondition, Double moneyReturn) {
		CashSuper cashSuper = null;
		switch(type) {
		case Normal:
			cashSuper = new CashNormal();
			break;
		case Rebate:
			cashSuper = new CashRebate(rebate);
			break;
		case Return:
			cashSuper = new CashReturn(moneyCondition, moneyReturn);
			break;
		}
		return cashSuper;
	}
}
