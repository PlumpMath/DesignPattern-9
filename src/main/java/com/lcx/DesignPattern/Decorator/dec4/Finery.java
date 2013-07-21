package com.lcx.DesignPattern.Decorator.dec4;

/**
 * 衣服类 
 * 相当于Decorator
 * 由于没有了Component类，所以直接继承Person类 
 * @author LCX
 * @date 2013-7-21 下午5:57:05
 */
public class Finery extends Person {
	
	protected Person component;
	
	public void decorate(Person component) {
		this.component = component;
	}
	
	@Override
	public void show() {
		if(component != null) {
			component.show();
		}
	}
}
