package com.jspider1.multithreading2.resource;

public class Godown1 {
	int product;

	public Godown1(int product) {
		super();
		System.out.println(product + " Product Available");
		this.product = product;
	}

	public int checkProduct() {
		return this.product;
	}

	public synchronized void salesOrdar(int product) {
		System.out.println("Ordar For " + product + " Produscts");
		if (product > checkProduct()) {
			System.out.println("producs " + product + " Not Available Please Wait...!!!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.product -= product;
		System.out.println(checkProduct() + " Product Available");
	}

	public synchronized void purchesOrdar(int product) {
		this.product += product;
		System.out.println("purchesed " + product + " products");
		System.out.println(checkProduct() + " Product Available");
	}
}
