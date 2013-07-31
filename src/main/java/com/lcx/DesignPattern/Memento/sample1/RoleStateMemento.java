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
}
