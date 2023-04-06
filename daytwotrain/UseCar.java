package com.onesoft.daytwotrain;

public class UseCar {
	public static void main(String [] args) {
		Car c=new Car();
		c.brand="Renault Nissan";
		c.colour="Red";
		c.price=2500000;
		c.model="Triber";
		c.mileage=18.2f;
		c.isPetrol=true;
		System.out.println("Brand="+c.brand+" Colour="+c.colour+" Price="+c.price+" Model="+c.model+" Mileage="+c.mileage+" IsPetrol="+c.isPetrol);
		
		Car c1=new Car();
		c1.brand="Honda";
		c1.colour="white";
		c1.price=2000000;
		c1.model="City";
		c1.mileage=19.2f;
		c1.isPetrol=true;
		System.out.println("Brand="+c1.brand+" Colour="+c1.colour+" Price="+c1.price+" Model="+c1.model+" Mileage="+c1.mileage+" IsPetrol="+c1.isPetrol);
	}

}
