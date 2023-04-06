package com.onesoft.function;

public class Bike {
	String brand;
	int price;
	String color;
	boolean isPetrol;
	
public int findNetprice(int discountpercentage ) {
	return price-(price*discountpercentage/100);
}
}
