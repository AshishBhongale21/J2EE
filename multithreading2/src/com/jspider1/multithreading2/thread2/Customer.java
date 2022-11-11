package com.jspider1.multithreading2.thread2;

import com.jspider1.multithreading2.resource.Godown1;

public class Customer extends Thread {

	Godown1 godown;
	int product;

	public Customer(Godown1 godown, int product) {
		super();
		this.godown = godown;
		this.product = product;
	}

	@Override
	public void run() {
		super.run();
		godown.salesOrdar(product);
		
	}

}
