package com.lcx.DesignPattern.FactoryMethod.calc3;

/**
 * 工厂方法实现的计算器 <br/>
 * 优点：实现了对扩展开放对修改封闭
 * @author LCX
 * @date 2013-7-22 下午10:35:14
 */
public class Main {


	public static void main(String[] args) {
		IFactory operationFactory = new AddFactory();
		Operation operation = operationFactory.createOperation();
		operation.setNumberA(10);
		operation.setNumberB(20);
		double result = operation.getResult();
		System.out.println(result);
	}

}
