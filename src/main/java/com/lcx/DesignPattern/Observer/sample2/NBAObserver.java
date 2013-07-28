package com.lcx.DesignPattern.Observer.sample2;

public class NBAObserver extends Observer {
	
	public NBAObserver() {}
	
	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(sub.getAction() + name + "，别看NBA直播了，继续工作！");
	}

}
