package com.lcx.DesignPattern.State.sample;

/**
 * Context类，维护一个ConcreteState实例
 * @author 李晨星
 * @date 2013-7-30 下午12:02:43
 */
public class Context {
	private State state;
	public Context(State state) {
		this.setState(state);
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
		System.out.println("当前状态：" + state.getClass().getName());
	}
	
	public void resquest() {
		state.handle(this);
	}
}
