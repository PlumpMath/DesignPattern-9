package com.lcx.DesignPattern.Memento.sample1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.init();
		lixiaoyao.stateDisplay();
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
	}

}
