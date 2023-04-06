package com.onesoft.dayfive;

public class UsePen {
	public static void main(String [] args) {
		Pen pen1=new Pen();
		pen1.brand="Reynolds";
		pen1.price=30;
		
		Pen pen2=new Pen();
		pen2.brand="Hero";
		pen2.price=100;
		if(pen1.price>pen2.price) {
			System.out.println(pen1.brand+"Price is high");
		}
		else {
			System.out.println(pen2.brand+"Price is high");
		}
		
				
		
	}

}


class Pen{
	String brand;
	int price;
}