package com.lcx.DesignPattern.Proxy.sample2;

/**
 * Subject类，定义了RealSubject和Proxy的公共接口，这样就在任何使用RealSubject的地方都可以使用Proxy
 * @author LCX
 * @date 2013-7-22 下午9:57:57
 */
public abstract class Subject {
	public abstract void request();
}
