package com.lcx.DesignPattern.Observer.sample1;

import java.util.ArrayList;
import java.util.List;

/**
 * 秘书类
 * 
 * @author LCX
 * @date 2013-7-28 上午11:56:11
 */
public class Secretary {
	private List<StockObserver> observers = new ArrayList<StockObserver>();
	private String action;

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
		notifyObserver();
	}
	/**
	 * 增加观察者。就是有几个同事想请前台帮忙，就给List增加几个对象。
	 */
	public void attachObserver(StockObserver stockObserver) {
		observers.add(stockObserver);
	}
	/**
	 * 通知。待老板来了，就通知所有已经登记了的同事们“老板来了”
	 */
	public void notifyObserver() {
		for(StockObserver observer : observers) {
			observer.update();
		}
	}
}
