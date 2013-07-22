package com.lcx.DesignPattern.FactoryMethod.calc3;

/**
 * 除法工厂
 * @author LCX
 * @date 2013-7-22 下午10:31:31
 */
public class DivFactory implements IFactory {

	public Operation createOperation() {
		return new OperationDiv();
	}

}
