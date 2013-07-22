package com.lcx.DesignPattern.Decorator.dec4.wardrobe;

/**
 * 衣服-T恤
 * @author 李晨星
 * @date 2013-7-22 下午3:44:01
 */
public class TShirts extends Finery {

	@Override
	public void show() {
		System.out.print("T恤");
		super.show();
	}
	
}
