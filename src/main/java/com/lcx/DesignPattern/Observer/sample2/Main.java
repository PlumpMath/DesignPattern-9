package com.lcx.DesignPattern.Observer.sample2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//老板老李
		Boss laoli = new Boss();
		StockObserver colleague1 = new StockObserver("李晨星", laoli);
		NBAObserver colleague2 = new NBAObserver("黄智峰", laoli);
		
		laoli.attach(colleague2);
		laoli.attach(colleague1);
		
		//老李回来
		laoli.setAction("我老李回来了！");
		
//		laoli.notifyObservers();
		
		
		//前台
		Secretary qiantai = new Secretary();
		StockObserver colleague3 = new StockObserver("张步云", qiantai);
		NBAObserver colleague4 = new NBAObserver("孙扬", qiantai);
		
		qiantai.attach(colleague4);
		qiantai.attach(colleague3);
		
		qiantai.setAction("老李回来了！");
		
//		qiantai.notifyObservers();
	}

}
