package com.lcx.DesignPattern.Proxy.sample2;

/**
 * Proxy类，保存一个引用，使得代理可以访问实体，并提供一个与Subject相同的接口，这样代理就可以用来代替实体
 * @author LCX
 * @date 2013-7-22 下午10:01:53
 */
public class Proxy extends Subject {
	
	private RealSubject realSubject;
	@Override
	public void request() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
