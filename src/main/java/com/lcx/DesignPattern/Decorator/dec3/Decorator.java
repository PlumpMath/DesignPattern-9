package com.lcx.DesignPattern.Decorator.dec3;

/**
 * 装饰的抽象类
 * 继承组件
 * @author 李晨星
 * @date 2013-7-22 下午3:39:19
 */
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
