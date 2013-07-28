package com.lcx.DesignPattern.Observer.sample2;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
		notifyObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for(Observer obserber : observers) {
			obserber.update();
		}
	}

}
