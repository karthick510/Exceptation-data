package com.onesoft.function;

public class UseBike {
	public static void main (String [] args) {
		Bike b1=new Bike();
		b1.brand="Hero";
		b1.price=85000;
		b1.color="Red";
		b1.isPetrol=true;
		
		    Bike b2=new Bike();
			b2.brand="Honda";
			b2.price=80000;
			b2.color="Black";
			b2.isPetrol=true;
			
			System.out.println("Brand="+b1.brand+"Net price="+b1.findNetprice(15));
			System.out.println("Brand="+b2.brand+"Net price="+b2.findNetprice(10));
	}
	
	

}
