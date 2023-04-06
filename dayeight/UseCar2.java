package com.onesoft.dayeight;

public class UseCar2 {
	public static void main (String [] args) {
		Car c1=new Car();
		c1.brand="Nisson";
		c1.price=950000;
		c1.model="Tiger";
		c1.isPetrol=true;
		c1.millege=14;
		c1.taxAmount=150000;
		c1.netprice=c1.price+c1.taxAmount;
		
		Car c2=new Car();
		c2.brand="Honda";
		c2.price=850000;
		c2.model="Swift";
		c2.isPetrol=false;
		c2.millege=17;
		c2.taxAmount=150000;
		c2.netprice=c2.price+c2.taxAmount;
		
		Car c3=new Car();
		c3.brand="Tata";
		c3.price=250000;
		c3.model="Nano";
		c3.isPetrol=true;
		c3.millege=8;
		c3.taxAmount=150000;
		c3.netprice=c3.price+c3.taxAmount;
		
		Car c4=new Car();
		c4.brand="kyundai";
		c4.price=785000;
		c4.model="Venue";
		c4.isPetrol=true;
		c4.millege=15;
		c4.taxAmount=150000;
		c4.netprice=c4.price+c4.taxAmount;
		
		Car c5=new Car();
		c5.brand="Benz";
		c5.price=985000;
		c5.model="Bnzeic";
		c5.isPetrol=true;
		c5.millege=15;
		c5.taxAmount=150000;
		c5.netprice=c5.price+c5.taxAmount;
		
		Car [] cars= {c1,c2,c3,c4,c5};
		int max=cars[0].netprice;
		for(int i=0; i<cars.length; i++) {
			if(cars[i].netprice>max){
				max=cars[i].netprice;
				System.out.println("Brand="+cars[i].brand+" Price=" +cars[i].price);
			}
			
		}
	
	}
	}


class Car {
	String brand;
	int price;
	String model;
	boolean isPetrol;
	int millege;
	int taxAmount;
	int netprice;
		

}