package com.lcx.DesignPattern.State.sample1;

public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getFinished()) {
			w.setState(new RestState());
			w.writeProgram();
		} else {
			if(w.getHour() < 21) {
				System.out.println("当前时间：" + w.getHour() + "点。加班啊啊，累死了。");
			} else {
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}

}
