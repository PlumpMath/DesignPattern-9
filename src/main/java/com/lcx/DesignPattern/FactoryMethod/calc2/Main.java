package com.lcx.DesignPattern.FactoryMethod.calc2;




/**
 * 简单工厂的计算器 <br/>
 * 如果想要增加一个“求M数的N次方”的功能，我们还要在OperationFactory中增加'case'条件分支 <br/>
 * 这就违背了开放-封闭原则（对扩展开放，对修改封闭）
 * @author LCX
 * @date 2013-7-21 上午11:20:44
 */
public class Main {

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
