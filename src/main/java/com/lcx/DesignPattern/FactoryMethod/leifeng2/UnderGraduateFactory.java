package com.lcx.DesignPattern.FactoryMethod.leifeng2;

/**
 * 雷锋的大学生工厂
 * @author LCX
 * @date 2013-7-22 下午11:08:07
 */
public class UnderGraduateFactory implements IFactory {

	public LeiFeng createLeiFeng() {
		return new UnderGraduate();
	}

}
