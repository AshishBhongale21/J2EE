package com.jspider.designpattern.builderpattern.object;

public class LaptopBuilder {

	private String brand;
	private String model;
	private double price;
	private String colour;
	private String os;
	private String processor;
	private int memory;
	private int storage;
	private double display;
	private int graphicsCard;
	private String battryCell;
	private String powerSupplay;

	public LaptopBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}

	public LaptopBuilder model(String model) {
		this.model = model;
		return this;
	}

	public LaptopBuilder price(double price) {
		this.price = price;
		return this;
	}

	public LaptopBuilder colour(String colour) {
		this.colour = colour;
		return this;
	}

	public LaptopBuilder os(String os) {
		this.os = os;
		return this;
	}

	public LaptopBuilder processor(String processor) {
		this.processor = processor;
		return this;
	}

	public LaptopBuilder memory(int memory) {
		this.memory = memory;
		return this;
	}

	public LaptopBuilder storage(int storage) {
		this.storage = storage;
		return this;
	}

	public LaptopBuilder display(double display) {
		this.display = display;
		return this;
	}

	public LaptopBuilder graphicsCard(int graphicsCard) {
		this.graphicsCard = graphicsCard;
		return this;
	}

	public LaptopBuilder battryCell(String battryCell) {
		this.battryCell = battryCell;
		return this;
	}

	public LaptopBuilder powerSupplay(String powerSupplay) {
		this.powerSupplay = powerSupplay;
		return this;
	}

	public Laptop getLaptop() {
		Laptop laptop = new Laptop(this.brand, this.model, this.colour, this.os, this.processor, this.memory,
				this.storage, this.display, this.price, this.graphicsCard, this.battryCell, this.powerSupplay);
		return laptop;

	}

}
