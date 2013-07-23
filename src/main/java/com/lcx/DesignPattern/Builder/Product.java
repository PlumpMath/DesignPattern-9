package com.lcx.DesignPattern.Builder;

import java.util.ArrayList;
import java.util.List;

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
