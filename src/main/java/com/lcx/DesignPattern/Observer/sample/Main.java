package com.lcx.DesignPattern.Observer.sample;

public class Main {

	/**
	 * P149
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		cs.attach(new ConcreteObserver("X", cs));
		cs.attach(new ConcreteObserver("Y", cs));
		cs.setSubjectState("ABC");
		cs.notifyObservsers();
	}

}
