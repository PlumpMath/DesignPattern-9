package com.lcx.DesignPattern.FactoryMethod.calc2;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		double result = getNumberA() * getNumberB();
		return result;
	}

}
