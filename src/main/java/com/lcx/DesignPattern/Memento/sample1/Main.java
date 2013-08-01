package com.lcx.DesignPattern.Memento.sample1;

public class Main {

	/**
	 * 备忘录模式
	 * @param args
	 */
	public static void main(String[] args) {
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.init();
		lixiaoyao.stateDisplay();
		
		//大战之前的保存游戏进度
		RoleStateCaretaker admin = new RoleStateCaretaker();
		admin.setMemento(lixiaoyao.saveState());
		
		//进行了殊死搏斗
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
		
		//大战之后回复体力
		lixiaoyao.recoeryState(admin.getMemento());
		lixiaoyao.stateDisplay();
		
	}

}
