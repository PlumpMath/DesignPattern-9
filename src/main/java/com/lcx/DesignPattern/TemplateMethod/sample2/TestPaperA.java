package com.lcx.DesignPattern.TemplateMethod.sample2;

/**
 * 学生A试卷
 * @author LCX
 * @date 2013-7-28 上午10:08:54
 */
public class TestPaperA extends TestPaper {

	@Override
	public void testQuestion1() {
		super.testQuestion1();
		System.out.println("答案：b");
	}

	@Override
	public void testQuestion2() {
		super.testQuestion2();
		System.out.println("答案：a");
	}

	@Override
	public void testQuestion3() {
		super.testQuestion3();
		System.out.println("答案：c");
	}
	
}
