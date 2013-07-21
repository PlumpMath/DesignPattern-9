package com.lcx.DesignPattern.FactoryMethod.calc2;

/**
 * 运算符
 * @author LCX
 *
 */
public enum Operator {
	ADD(1),DIV(2),MUL(3),SUB(4);
	public int value;
	private Operator(int value) {
		this.value = value;
	}
}
