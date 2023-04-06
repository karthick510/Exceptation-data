package com.onesoft.n;

public class Vehicle {
	String brand;
	int price;
	public String findnetprice (int price) {
		return "netprice="+(price+(price*10/100));
	}

}
