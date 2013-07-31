package com.lcx.DesignPattern.State.sample1;

public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
			if(w.getHour() < 13) {
				System.out.println("当前时间：" + w.getHour() + "点。饿死了，吃午饭，吃完了就困，午休");
			} else {
				w.setState(new AfterNoonState());
				w.writeProgram();
			}
	}

}
