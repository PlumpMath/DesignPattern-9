package com.lcx.DesignPattern.Builder.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类 由多个部件组成
 * @author LCX
 * @date 2013-7-28 上午11:41:46
 */
public class Product {
	List<String> parts = new ArrayList<String>(0);
	public void add(String part) {
		parts.add(part);
	}
	public void show() {
		System.out.println("产品创建：");
		for(String part : parts) {
			System.out.println(part);
		}
	}
}
