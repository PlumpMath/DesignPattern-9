package com.lcx.DesignPattern.TemplateMethod.sample3;

public class TestPaperA extends TestPaper {

	@Override
	public String answer1() {
		return "b";
	}

	@Override
	public String answer2() {
		return "c";
	}

	@Override
	public String answer3() {
		return "a";
	}

}
