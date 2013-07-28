package com.lcx.DesignPattern.Observer.sample3;

import java.util.Observable;

public class Subject extends Observable {
	/**
	 * 业务方法，一旦执行，则通知观察者
	 */
	public void doBusiness() {
		super.setChanged();
		notifyObservers("现在还没有参数");
	}
}
