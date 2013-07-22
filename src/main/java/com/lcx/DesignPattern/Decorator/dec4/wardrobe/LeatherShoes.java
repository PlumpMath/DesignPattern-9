package com.lcx.DesignPattern.Decorator.dec4.wardrobe;

/**
 * 衣服-皮鞋
 * @author 李晨星
 * @date 2013-7-22 下午3:53:30
 */
public class LeatherShoes extends Finery {
	@Override
	public void show() {
		System.out.print("皮鞋");
		super.show();
	}
}
