package com.lcx.DesignPattern.Strategy.Cash3;

/**
 * 上下文
 * @author LCX
 * @date 2013-7-21 下午2:50:31
 */
public class Context {
	
	private Strategy strategy;
	
	/**
	 * 初始化时传入具体的策略
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 根据具体的策略对象，调用起算法的方法
	 */
	public void contextInterfate() {
		strategy.algorithmStrategy();
	}
}
