package com.lcx.DesignPattern.FactoryMethod.calc3;

/**
 * 减法工厂
 * @author LCX
 * @date 2013-7-22 下午10:30:07
 */
public class SubFactory implements IFactory {

	public Operation createOperation() {
		return new OperationSub();
	}

}
