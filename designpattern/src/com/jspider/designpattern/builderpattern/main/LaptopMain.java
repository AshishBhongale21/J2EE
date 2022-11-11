package com.jspider.designpattern.builderpattern.main;

import com.jspider.designpattern.builderpattern.object.Laptop;
import com.jspider.designpattern.builderpattern.object.LaptopBuilder;

public class LaptopMain {
	
	public static void main(String[] args) {
		
		Laptop laptop = new LaptopBuilder().brand("Lenovo").model("ideadpadGAMING").price(60000).getLaptop();
		
		System.out.println(laptop);
	}

}
