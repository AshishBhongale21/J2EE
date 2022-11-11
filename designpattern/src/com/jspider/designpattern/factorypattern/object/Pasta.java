package com.jspider.designpattern.factorypattern.object;

import com.jspider.designpattern.factorypattern.inter.FastFood;

public class Pasta implements FastFood{

	@Override
	public void ordarFood() {
		System.out.println("Your Pasta order is Confirmed....!!!");		
	}

}
