package com.lcx.DesignPattern.Observer.sample2;


public class StockObserver extends Observer {
	
	public StockObserver() {}
	
	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(sub.getAction() + name + "，关闭股票行情，继续工作！");
	}

}
