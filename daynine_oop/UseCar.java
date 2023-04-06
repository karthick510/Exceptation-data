package com.onesoft.daynine_oop;

public class UseCar {
	public static void main (String [] args) {
		Engine e1=new Engine();
		e1.brand="Ford";
		e1.engineCC=170;
		e1.price=35000;
		
		Car c1=new Car();
		c1.brand="BMW";
		c1.price=2500000;
		c1.engine=e1;
		
		Engine e2=new Engine();
		e2.brand="SKODA";
		e2.engineCC=180;
		e2.price=40000;
		
		Car c2=new Car();
		c2.brand="SWIFT";
		c2.price=400000;
		c2.engine=e2;
		
		Engine e3=new Engine();
		e3.brand="Honda";
		e3.engineCC=190;
		e3.price=28000;
		
		Car c3=new Car();
		c3.brand="NISSION";
		c3.price=620000;
		c3.engine=e3;
		
		Car [] cars= {c1,c2,c3};
		for(int i=0; i<cars.length; i++) {
			if (cars[i].engine.brand.startsWith("S")) {
			System.out.println("Car Brand="+cars[i].brand+" Car Price="+cars[i].price);
			System.out.println("Engine brand="+cars[i].engine.brand);
			}
	}
	}
}

