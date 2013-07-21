package com.lcx.DesignPattern.FactoryMethod.calc1;

import java.util.Scanner;


/**
 * 这是一个简单的面向对象的计算器
 * 并且设计了抽象类Operation方便增加不同的运算方法
 * @author LCX
 * @date 2013-7-21 上午11:22:58
 */
public class calc1 {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入数字A");
			double numberA = scan.nextDouble();
			System.out.println("请输入数字B");
			double numberB = scan.nextDouble();
			System.out.println("请输入运算符");
			String operator = scan.next();
			if(operator.equals("+")) {
				System.out.println(numberA + numberB);
			} else if(operator.equals("-")) {
				System.out.println(numberA - numberB);
			} else {
				System.out.println("您输入的运算符不被支持");
			}
		} catch (Exception e) {
			System.out.println("你的输入有误。" + e.getMessage());
		}

	}

}
