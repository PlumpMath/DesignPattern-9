package com.lcx.DesignPattern.FactoryMethod.leifeng2;

/**
 * 雷锋的社区志愿者工厂
 * @author LCX
 * @date 2013-7-22 下午11:09:00
 */
public class VolunteerFactory implements IFactory {

	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
