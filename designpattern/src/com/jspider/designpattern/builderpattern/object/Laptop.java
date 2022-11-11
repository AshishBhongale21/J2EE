package com.jspider.designpattern.builderpattern.object;

public class Laptop {

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

	public Laptop(String brand, String model, String colour, String os, String processor, int memory, int storage,
			double display, double price, int graphicsCard, String battryCell, String powerSupplay) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.os = os;
		this.processor = processor;
		this.memory = memory;
		this.storage = storage;
		this.display = display;
		this.price = price;
		this.graphicsCard = graphicsCard;
		this.battryCell = battryCell;
		this.powerSupplay = powerSupplay;
	}

	@Override
	public String toString() {

		return "Laptop Specifications \n Brand = " + brand + ",\n Model = " + model + ",\n Price = " + price
				+ ",\n Colour = " + colour + ",\n OS = " + os + ",\n Processor = " + processor + ",\n Memory = "
				+ memory + ",\n Storage = " + storage + ",\n Display Size = " + display + ",\n Graphics Card = "
				+ graphicsCard + ",\n Battery Cell = " + battryCell + ",\n Power Supplay = " + powerSupplay + ",";
	}
}
