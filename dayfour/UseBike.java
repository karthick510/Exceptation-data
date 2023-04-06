package com.onesoft.dayfour;

public class UseBike {
	public static void main(String [] args) {
		Bike bike1=new Bike();
		bike1.brand=args[0];
		bike1.price=Integer.parseInt(args[1]);
		bike1.color=args[2];
		Bike bike2=new Bike();
		bike2.brand=args[3];
		bike2.price=Integer.parseInt(args[4]);
		bike2.color=args[5];
		System.out.println("Brand="+bike1.brand+" price="+bike1.price);
		System.out.println("Brand="+bike2.brand+" price="+bike2.price);
		
	}

}

  class Bike {
	  String brand;
	  int price;
	  String color;
  }