package com.onesoft.dayeight;

public class UseCar {
	public static void main (String [] args) {
	Car c1=new Car();
	c1.brand="Nisson";
	c1.price=950000;
	c1.model="Tiger";
	c1.isPetrol=true;
	c1.millege=14;
	
	Car c2=new Car();
	c2.brand="Honda";
	c2.price=850000;
	c2.model="Swift";
	c2.isPetrol=true;
	c2.millege=17;
	
	Car c3=new Car();
	c3.brand="Tata";
	c3.price=250000;
	c3.model="Nano";
	c3.isPetrol=true;
	c3.millege=8;
	
	Car c4=new Car();
	c4.brand="Hyundai";
	c4.price=785000;
	c4.model="Venue";
	c4.isPetrol=true;
	c4.millege=15;
	
	Car c5=new Car();
	c5.brand="Benz";
	c5.price=7585000;
	c5.model="Bnzeic";
	c5.isPetrol=true;
	c5.millege=15;
	
	Car c6=new Car();
	c6.brand="DriveSpark";
	c6.price=985000;
	c6.model="Crieta";
	c6.isPetrol=true;
	c6.millege=15;
	Car [] cars= {c1,c2,c3,c4,c5,c6};
	Car temp=cars[0];
	for(int i=0; i<cars.length; i++) {
		if (cars[i].brand.equals("Benz")) {
			System.out.println("New rate of benz cars=" +(cars[i].price-100000));
					}
		if(cars[i].price<temp.price) {
			temp=cars[i];
			System.out.println(temp.brand);
		}
	if(cars[i].brand.startsWith("H")) {
		System.out.println(cars[i].brand);
	}
	if (cars[i].price>800000 && cars[i].price<2000000) {
		System.out.println(cars[i].brand);
	}
	Car temp1=cars[0];
	if(cars[i].brand.length()<temp1.brand.length()) {
		temp1=cars[i];
		System.out.println("N="+temp1.brand);
		}
	if(cars[i].millege>=10) {
		System.out.println("Millege="+cars[i].brand);
	
	}
		}
	
			}
}



