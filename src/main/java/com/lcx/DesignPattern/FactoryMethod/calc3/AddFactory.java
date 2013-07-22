package com.lcx.DesignPattern.FactoryMethod.calc3;

/**
 * 加法类工厂
 * @author LCX
 * @date 2013-7-22 下午10:22:07
 */
public class AddFactory implements IFactory {

	public Operation createOperation() {
		return new OperationAdd();
	}
}
