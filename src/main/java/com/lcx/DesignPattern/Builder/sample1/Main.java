package com.lcx.DesignPattern.Builder.sample1;

public class Main {
	
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector(new FatPersonBuilder());
		pd.createPerson();
	}

}
