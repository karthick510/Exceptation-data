package com.onesoft.daynine_oop;

public class Pen {
	private String brand;
	private int price;
	private Refill refill;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand () {
		return brand;
	}
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice () {
		return price;
	}
	public void setRefill(Refill refill) {
		this.refill=refill;
	}
	public Refill getRefill () {
		return refill;
	}
	
	}
		


