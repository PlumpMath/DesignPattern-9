package com.lcx.DesignPattern.Builder.sample;

/**
 * 指挥者类
 * @author LCX
 * @date 2013-7-28 上午11:42:57
 */
public class Director {
	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
