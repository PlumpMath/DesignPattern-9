package com.lcx.DesignPattern.Observer.sample1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//前台
		Secretary secretary = new Secretary();
		
		//同事
		StockObserver colleague1 = new StockObserver("黄智峰", secretary);
		StockObserver colleague2 = new StockObserver("张步云", secretary);
		
		//前台几下两个同事
		secretary.attachObserver(colleague1);
		secretary.attachObserver(colleague2);
		
		//发现老板回来了
		secretary.setAction("老板来了");
		
	}

}
