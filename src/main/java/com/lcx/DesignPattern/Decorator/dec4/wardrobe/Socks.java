package com.lcx.DesignPattern.Decorator.dec4.wardrobe;

/**
 * 衣服-袜子
 * @author 李晨星
 * @date 2013-7-22 下午3:49:27
 */
public class Socks extends Finery {
	@Override
	public void show() {
		System.out.print("袜子");
		super.show();
	}
}
