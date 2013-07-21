package com.lcx.DesignPattern.FactoryMethod.calc2;




/**
 * 运用了简单工厂的计算器
 * @author LCX
 * @date 2013-7-21 上午11:20:44
 */
public class Calc {

	public static void main(String[] args) {
		try {
			Operation operation = OperationFactory.createOperation(Operator.DIV);
			operation.setNumberA(10);
			operation.setNumberB(0);
			System.out.println(operation.getResult());
		} catch (Exception e) {
			System.out.println("您的输入有误。" + e.getMessage());
		}
		
		

	}

}
