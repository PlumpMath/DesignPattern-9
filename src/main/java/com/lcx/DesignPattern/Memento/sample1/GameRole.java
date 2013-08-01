package com.lcx.DesignPattern.Memento.sample1;

public class GameRole {
	private int healthPoint;
	private int manaPoint;
	private int attack;
	private int denfence;

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public int getManaPoint() {
		return manaPoint;
	}

	public void setManaPoint(int manaPoint) {
		this.manaPoint = manaPoint;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDenfence() {
		return denfence;
	}

	public void setDenfence(int denfence) {
		this.denfence = denfence;
	}

	public void stateDisplay() {
		System.out.println("当前角色状态：");
		System.out.println("血量：" + healthPoint);
		System.out.println("魔法：" + manaPoint);
		System.out.println("攻击力：" + attack);
		System.out.println("防御力：" + denfence);
	}

	public void init() {
		this.healthPoint = 100;
		this.manaPoint = 100;
		this.attack = 50;
		this.denfence = 20;
	}

	public void fight() {
		System.out.println("与怪物进行了殊死搏斗");
		this.healthPoint = 5;
		this.manaPoint = 0;
		this.attack = 5;
		this.denfence = 0;
	}
	
	public RoleStateMemento saveState() {
		return new RoleStateMemento(healthPoint, manaPoint, attack, denfence);
	}
	
	public void recoeryState(RoleStateMemento memento) {
		this.healthPoint = memento.getHealthPoint();
		this.manaPoint = memento.getManaPoint();
		this.attack = memento.getAttack();
		this.denfence = memento.getDenfence();
	}

}
