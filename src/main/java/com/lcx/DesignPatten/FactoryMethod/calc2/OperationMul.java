package com.lcx.DesignPatten.FactoryMethod.calc2;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		double result = getNumberA() * getNumberB();
		return result;
	}

}
