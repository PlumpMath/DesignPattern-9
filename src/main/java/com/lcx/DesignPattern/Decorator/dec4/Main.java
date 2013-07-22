package com.lcx.DesignPattern.Decorator.dec4;

import com.lcx.DesignPattern.Decorator.dec4.wardrobe.BigTrouser;
import com.lcx.DesignPattern.Decorator.dec4.wardrobe.LeatherShoes;
import com.lcx.DesignPattern.Decorator.dec4.wardrobe.Socks;
import com.lcx.DesignPattern.Decorator.dec4.wardrobe.SportsShoes;
import com.lcx.DesignPattern.Decorator.dec4.wardrobe.Suits;
import com.lcx.DesignPattern.Decorator.dec4.wardrobe.TShirts;

/**
 * 装饰模式的穿衣服 <br/> 
 * @author LCX
 * @date 2013-7-21 下午5:29:54
 */
public class Main {

	public static void main(String[] args) {
		Person person = new Person("李晨星");
		BigTrouser bigTrouser = new BigTrouser();
		Suits suits = new Suits();
		TShirts tshirts = new TShirts();
		LeatherShoes leatherShoes = new LeatherShoes();
		Socks socks = new Socks();
		SportsShoes sportsShoes = new SportsShoes();
		System.out.println("第一种装扮");
		bigTrouser.decorate(person);
		tshirts.decorate(bigTrouser);
		socks.decorate(tshirts);
		sportsShoes.decorate(socks);
		sportsShoes.show();
		System.out.println("第二种装扮");
		suits.decorate(person);
		socks.decorate(suits);
		leatherShoes.decorate(socks);
		leatherShoes.show();
		
	}

}
