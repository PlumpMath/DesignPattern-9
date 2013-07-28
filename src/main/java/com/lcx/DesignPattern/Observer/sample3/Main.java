package com.lcx.DesignPattern.Observer.sample3;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个被观察者
		Subject subject = new Subject();
		
		//创建两个观察者
		JmsObserver jmsObserver = new JmsObserver();
		MailObserver mailObserver = new MailObserver();
		
		subject.addObserver(jmsObserver);
		subject.addObserver(mailObserver);
		
		subject.doBusiness();
	}

}
