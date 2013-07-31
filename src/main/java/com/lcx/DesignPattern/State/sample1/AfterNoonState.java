package com.lcx.DesignPattern.State.sample1;

public class AfterNoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 17) {
			System.out.println("当前时间：" + w.getHour() + "点。下午状态还不错，继续干活。");
		} else {
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}
