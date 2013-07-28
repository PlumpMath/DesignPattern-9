package com.lcx.DesignPattern.Observer.sample2;

/**
 * 通知者接口
 * @author LCX
 * @date 2013-7-28 下午1:11:42
 */
public interface Subject {
	
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void notifyObservers();
	
	public String getAction();

}
