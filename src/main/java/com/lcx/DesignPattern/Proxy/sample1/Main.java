package com.lcx.DesignPattern.Proxy.sample1;

public class Main {
	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl("刘小漫");
		Proxy proxy = new Proxy(schoolGirl);
		proxy.giveFlowers();
	}

}
