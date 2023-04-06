package com.onesoft.daythreetest;

public class UseCar {
	public static void main(String [] args) {
		Car c1=new Car();
		c1.brand="Bmw";
		c1.model="XVI";
		c1.price=400000;
		c1.isPetrol=false;
		String r1=c1.brand.toUpperCase();
		int r2=c1.brand.length();
		System.out.println(r1+" "+r2);
		
		Car c2=new Car();
		c2.brand="tata";
		c2.model="IX";
		c2.price=300000;
		c2.isPetrol=true;
		String r3=c2.brand.toUpperCase();
		int r4=c2.brand.length();
		System.out.println(r3+" "+r4);
		
		Car c3=new Car();
		c3.brand="swift";
		c3.model="X2V";
		c3.price=200000;
		c3.isPetrol=true;
		String r5=c3.brand.toUpperCase();
		int r6=c3.brand.length();
		System.out.println(r5+" "+r6);
		System.out.println(c1.price+c2.price+c3.price);
	}

}
