package com.lcx.DesignPattern.Observer.sample3;

import java.util.Observable;
import java.util.Observer;

public class JmsObserver implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("发送Jms的观察者已经执行" + arg);
	}

}
