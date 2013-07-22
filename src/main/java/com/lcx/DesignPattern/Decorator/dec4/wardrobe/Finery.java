package com.lcx.DesignPattern.Decorator.dec4.wardrobe;

import com.lcx.DesignPattern.Decorator.dec4.Person;

/**
 * 衣服类 <br/>
 * 相当于Decorator <br/> 
 * 因为只有一个实体"人"，所以不用Component抽象类，所以直接继承Person类  <br/> 
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
