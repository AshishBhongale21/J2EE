package com.jspider1.multithreading2.thread2;

import com.jspider1.multithreading2.resource.Godown1;

public class Supplier extends Thread {

	Godown1 godown;
	int peoduct;

	public Supplier(Godown1 godown, int peoduct) {
		super();
		this.godown = godown;
		this.peoduct = peoduct;
	}

	@Override
	public void run() {
		super.run();
		godown.purchesOrdar(peoduct);
	}
}
