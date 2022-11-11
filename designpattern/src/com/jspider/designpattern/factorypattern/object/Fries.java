package com.jspider.designpattern.factorypattern.object;

import com.jspider.designpattern.factorypattern.inter.FastFood;

public class Fries implements FastFood{
	
	@Override
	public void ordarFood() {
		System.out.println("Your Fries order is Confirmed....!!!");		
	}
}
