package com.lcx.DesignPattern.Builder.sample;

/**
 * 具体建造者类
 * @author LCX
 * @date 2013-7-28 上午11:42:43
 */
public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		return product	;
	}

}
