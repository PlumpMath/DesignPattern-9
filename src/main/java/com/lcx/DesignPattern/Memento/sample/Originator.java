package com.lcx.DesignPattern.Memento.sample;

/**
 * 发起人类
 * @author 李晨星
 * @date 2013-7-31 下午5:14:20
 */
public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return (new Memento(state));
	}
	
	public void setMemento(Memento memento) {
		state = memento.getState();
	}
	
	public void show() {
		System.out.println("State = " + state);
	}
}
