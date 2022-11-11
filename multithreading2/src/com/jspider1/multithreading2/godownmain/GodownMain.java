package com.jspider1.multithreading2.godownmain;

import com.jspider1.multithreading2.resource.Godown1;
import com.jspider1.multithreading2.thread2.Customer;
import com.jspider1.multithreading2.thread2.Supplier;

public class GodownMain {

	public static void main(String[] args) {
		
		Godown1 godown = new Godown1(100);
		Customer customer1 = new Customer(godown, 50);
		Customer customer2 = new Customer(godown, 70);
		Supplier supplier = new Supplier(godown, 100);
		
		
		customer1.start();
		customer2.start();	
		supplier.start();
	}

}


