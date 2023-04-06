package com.onesoft.daynine_oop;

public class Chair {
	private String brand;
	private int price;
	private Wood wood;
	public void setBrand (String brand) {
		this.brand=brand;
	}
	public String getBrand () {
		return brand;
	}
	public void setPrice (int p) {
		price=p;
	}
	public int getPrice () {
		return price;
	}
	public void setWood (Wood wood) {
		this.wood=wood;
	}
	public Wood getWood () {
		return wood;
	}

}
