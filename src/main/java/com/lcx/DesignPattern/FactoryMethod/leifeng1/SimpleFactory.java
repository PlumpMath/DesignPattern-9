package com.lcx.DesignPattern.FactoryMethod.leifeng1;

/**
 * 简单雷锋工厂
 * @author LCX
 * @date 2013-7-22 下午10:58:13
 */
public class SimpleFactory {
	public static LeiFeng createLeiFent(LeiFengType type) {
		LeiFeng leifeng = null;
		switch (type) {
		case UnderGraduate:
			leifeng = new UnderGraduate();
			break;
		case Volunteer:
			leifeng = new Volunteer();
			break;
		}
		return leifeng;
	}
}
