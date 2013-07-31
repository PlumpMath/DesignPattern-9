package com.lcx.DesignPattern.Memento.sample;

/**
 * 管理者类
 * @author 李晨星
 * @date 2013-7-31 下午5:19:57
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
