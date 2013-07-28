package com.lcx.DesignPattern.Observer.sample2;

import java.util.ArrayList;
import java.util.List;

/**
 * 秘书类
 * 
 * @author LCX
 * @date 2013-7-28 上午11:56:11
 */
public class Secretary implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
		notifyObservers();
	}
	/**
	 * 增加观察者。就是有几个同事想请前台帮忙，就给List增加几个对象。
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	/**
	 * 通知。待老板来了，就通知所有已经登记了的同事们“老板来了”
	 */
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
	
}
