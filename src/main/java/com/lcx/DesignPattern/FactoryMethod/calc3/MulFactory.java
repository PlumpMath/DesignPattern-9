package com.lcx.DesignPattern.FactoryMethod.calc3;

/**
 * 乘法工厂
 * @author LCX
 * @date 2013-7-22 下午10:30:51
 */
public class MulFactory implements IFactory {

	public Operation createOperation() {
		return new OperationMul();
	}

}
