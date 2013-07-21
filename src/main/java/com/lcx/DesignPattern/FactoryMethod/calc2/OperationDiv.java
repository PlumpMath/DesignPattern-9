package com.lcx.DesignPattern.FactoryMethod.calc2;

public class OperationDiv extends Operation {

	@Override
	public double getResult() throws Exception {
		if(getNumberB() == 0) {
			throw new Exception("被除数不能为0。");
		}
		double result = getNumberA() / getNumberB();
		return result;
	}

}
