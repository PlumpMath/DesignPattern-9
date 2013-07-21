package com.lcx.DesignPattern.Decorator.dec3;

public abstract class Decorator extends Component {
	
	protected Component component;
	
	public Decorator() {}
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void setComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		if(component != null) {
			component.operation();
		}
	}

}
