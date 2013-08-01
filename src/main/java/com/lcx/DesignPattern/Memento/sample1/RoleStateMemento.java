package com.lcx.DesignPattern.Memento.sample1;

public class RoleStateMemento {
	private int healthPoint;
	private int manaPoint;
	private int attack;
	private int denfence;
	
	public RoleStateMemento(int healthPoint, int manaPoint, int attack, int defence) {
		this.healthPoint = healthPoint;
		this.manaPoint = manaPoint;
		this.attack = attack;
		this.denfence = defence;
	}

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
}
