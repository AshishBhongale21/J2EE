package com.jspider.designpattern.factorypattern.object;

import com.jspider.designpattern.factorypattern.inter.FastFood;

public class Burger implements FastFood {

	@Override
	public void ordarFood() {
		System.out.println("Your Burger order is Confirmed....!!!");

	}
}
