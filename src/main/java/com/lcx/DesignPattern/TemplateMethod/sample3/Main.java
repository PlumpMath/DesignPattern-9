package com.lcx.DesignPattern.TemplateMethod.sample3;


/**
 * 最后的模版方法模式
 * @author LCX
 * @date 2013-7-28 上午10:18:22
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("学生甲抄的试卷：");
		TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();
        
        System.out.println("学生乙抄的试卷：");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
	}

}
