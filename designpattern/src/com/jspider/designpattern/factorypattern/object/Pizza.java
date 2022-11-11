package com.jspider.designpattern.factorypattern.object;

import com.jspider.designpattern.factorypattern.inter.FastFood;

public class Pizza implements FastFood {

	@Override
	public void ordarFood() {
		System.out.println("Your Pizza order is Confirmed....!!!");

	}

}
