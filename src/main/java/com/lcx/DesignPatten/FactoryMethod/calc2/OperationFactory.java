package com.lcx.DesignPatten.FactoryMethod.calc2;

/**
 * 运算方法工厂类
 * @author LCX
 * @date 2013-7-21 上午11:24:15
 */
public class OperationFactory {
	public static Operation createOperation(Operator operator) {
		
		Operation operation = null;
		switch (operator) {
		case ADD:
			operation = new OperationAdd();
			break;
		case DIV:
			operation = new OperationDiv();
			break;
		case MUL:
			operation = new OperationMul();
			break;
		case SUB:
			operation = new OperationSub();
		default:
			break;
		}
		return operation;
	}

}
