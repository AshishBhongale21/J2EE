package com.jspider.designpattern.factorypattern.object;

import com.jspider.designpattern.factorypattern.inter.FastFood;

public class ColdCoffee implements FastFood{
	
	@Override
	public void ordarFood() {
		System.out.println("Your Cold Coffee order is Confirmed....!!!");		
	}

}
