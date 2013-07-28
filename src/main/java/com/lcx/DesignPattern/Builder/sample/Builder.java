package com.lcx.DesignPattern.Builder.sample;

/**
 * 抽象建造者类
 * @author LCX
 * @date 2013-7-28 上午11:42:06
 */
public abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
