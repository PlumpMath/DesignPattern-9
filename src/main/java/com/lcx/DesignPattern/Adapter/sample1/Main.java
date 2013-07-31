package com.lcx.DesignPattern.Adapter.sample1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player a = new Forward("Jams");
		a.attack();
		
		Player b = new Forward("Kobe");
		b.defense();
		
		Translator c = new Translator("李晨星");
		
		c.attack();
	}

}
