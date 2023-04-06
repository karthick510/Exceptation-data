package com.onesoft.n;

public class Stationery {
	String brand;
	int price;
	String colour;
	public Stationery(String brand, int price, String colour) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	}
	public String toString () {
		return (brand+price+colour);
	}
	}


