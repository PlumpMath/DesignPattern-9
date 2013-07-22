package com.lcx.DesignPattern.FactoryMethod.leifeng2;

/**
 * 
 * @author LCX
 * @date 2013-7-22 下午11:09:48
 */
public class Main {

	public static void main(String[] args) {
		IFactory factory = new UnderGraduateFactory();
		LeiFeng leifeng = factory.createLeiFeng();
		
		leifeng.buyRice();
		leifeng.sweep();
		leifeng.wash();
	}

}
