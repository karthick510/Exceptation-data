package com.onesoft.daytwotest;

public class UseAirConditioner {
	public static void main(String [] args) {
		AirConditioner a=new AirConditioner();
		a.brand="Panasonic";;
		a.price=38000;
		a.noOfWings=4;
		a.isQuality=true;
		System.out.println(a.brand+" "+a.price+" "+a.noOfWings+" "+a.isQuality);
		
		AirConditioner a1=new AirConditioner();
		a1.brand="Bluestar";;
		a1.price=42000;
		a1.noOfWings=3;
		a1.isQuality=true;
		System.out.println(a1.brand+" "+a1.price+" "+a1.noOfWings+" "+a1.isQuality);
	} 

}
