package com.lcx.DesignPattern.FactoryMethod.leifeng1;

/**
 * 简单工厂模式的雷锋<br/>
 * 客户端只需更改Type
 * @author LCX
 * @date 2013-7-22 下午11:03:42
 */
public class Main {

	public static void main(String[] args) {
									//三句重复的代码
		LeiFeng stu1 = SimpleFactory.createLeiFent(LeiFengType.UnderGraduate);
		LeiFeng stu2 = SimpleFactory.createLeiFent(LeiFengType.UnderGraduate);
		LeiFeng stu3 = SimpleFactory.createLeiFent(LeiFengType.UnderGraduate);
		stu1.buyRice();
		stu2.wash();
		stu3.sweep();
	}

}
