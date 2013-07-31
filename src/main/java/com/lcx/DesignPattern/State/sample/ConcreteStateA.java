package com.lcx.DesignPattern.State.sample;

public class ConcreteStateA extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateB());
	}

}
