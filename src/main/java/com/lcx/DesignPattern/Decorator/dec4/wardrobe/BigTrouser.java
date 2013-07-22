package com.lcx.DesignPattern.Decorator.dec4.wardrobe;

/**
 * 衣服-跨裤
 * @author 李晨星
 * @date 2013-7-22 下午3:43:36
 */
public class BigTrouser extends Finery {

		@Override
		public void show() {
			System.out.print("跨裤");
			super.show();
		}
}
