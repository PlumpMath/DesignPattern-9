package com.lcx.DesignPattern.Adapter.sample;

/**
 * 通过内部包装一个Adaptee对象，把原借口转换成目标接口。
 * @author 李晨星
 * @date 2013-7-31 下午4:05:36
 */
public class Adapter extends Target {
	
	private Adaptee adaptee = new Adaptee();	//建一个私有的Adaptee对象

	@Override
	public void request() {
		adaptee.specialRequest();	//这样就可以把表面上调用request方法变成实际上调用specialRequest
	}

}
