package com.lcx.DesignPattern.Decorator.dec4.wardrobe;

/**
 * 衣服-运动鞋
 * @author 李晨星
 * @date 2013-7-22 下午3:52:28
 */
public class SportsShoes extends Finery {
	@Override
	public void show() {
		System.out.print("运动鞋");
		super.show();
	}
}
