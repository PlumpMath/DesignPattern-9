package com.lcx.DesignPattern.Observer.sample2;

/**
 * 抽象观察者
 * @author LCX
 * @date 2013-7-28 下午12:11:24
 */
public abstract class Observer {
	protected String name;
	protected Subject sub;
	public Observer() {}
	public Observer(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	public abstract void update();
}
