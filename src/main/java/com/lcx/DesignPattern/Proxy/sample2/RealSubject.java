package com.lcx.DesignPattern.Proxy.sample2;

/**
 * RealSubject类，定义Proxy代表的真实实体
 * @author LCX
 * @date 2013-7-22 下午9:59:48
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真实的请求");
	}

}
