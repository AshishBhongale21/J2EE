package com.jspider.designpattern.factorypattern.main;

import java.util.Scanner;

import com.jspider.designpattern.factorypattern.inter.FastFood;
import com.jspider.designpattern.factorypattern.object.Burger;
import com.jspider.designpattern.factorypattern.object.ColdCoffee;
import com.jspider.designpattern.factorypattern.object.Fries;
import com.jspider.designpattern.factorypattern.object.Pasta;
import com.jspider.designpattern.factorypattern.object.Pizza;

public class Cafe {

	static boolean loop = true;
	static FastFood fastFood;

	public static void main(String[] args) {

		while (loop) {
			try {
				fastFoodFactory().ordarFood();
			} catch (NullPointerException e) {
				System.out.println("No Food Ordered");
			}
		}
	}

	public static FastFood fastFoodFactory() {

		System.out.println("Select Your Order : \n" + "1. Pizza \n" + "2. Burger \n" + "3. Fries \n" + "4. Pasta \n"
				+ "5. ColdCoffe");
		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {
		case 1:
			fastFood = new Pizza();
			loop = false;
			return fastFood;

		case 2:
			fastFood = new Burger();
			loop = false;
			return fastFood;

		case 3:
			fastFood = new Fries();
			loop = false;
			return fastFood;

		case 4:
			fastFood = new Pasta();
			loop = false;
			return fastFood;

		case 5:
			fastFood = new ColdCoffee();
			loop = false;
			return fastFood;

		default:
			System.out.println("Invalid Choice");
			loop = false;
			return fastFood;
		}
	}
}
