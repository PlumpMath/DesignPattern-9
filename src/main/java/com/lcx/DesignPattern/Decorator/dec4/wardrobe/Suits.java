package com.lcx.DesignPattern.Decorator.dec4.wardrobe;

/**
 * 衣服-西服
 * @author 李晨星
 * @date 2013-7-22 下午3:43:51
 */
public class Suits extends Finery {
	@Override
	public void show() {
		System.out.print("西服");
		super.show();
	}
}
