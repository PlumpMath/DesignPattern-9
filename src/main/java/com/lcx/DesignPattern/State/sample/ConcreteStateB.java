package com.lcx.DesignPattern.State.sample;

public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}

}
