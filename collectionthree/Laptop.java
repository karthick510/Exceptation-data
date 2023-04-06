package com.onesoft.collectionthree;

public class Laptop {
	private String brand;
	private int price;
	private String processor;
	boolean isTouchScreen;
	private String color;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public void setTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Laptop(String brand, int price, String processor, boolean isTouchScreen, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.isTouchScreen = isTouchScreen;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", processor=" + processor + ", isTouchScreen="
				+ isTouchScreen + ", color=" + color + "]";
	}

}
