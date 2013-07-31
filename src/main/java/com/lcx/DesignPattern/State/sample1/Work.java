package com.lcx.DesignPattern.State.sample1;

public class Work {
	private State state;
	private Integer hour;
	private Boolean finished = false;

	public Work() {
		setState(new ForenoonState());
	}

	public Work(State state) {
		setState(state);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public void writeProgram() {
		state.writeProgram(this);
	}

}
