package com.onesoft.n;

public class UseElectricBike {
	public static void main (String [] args) {
		ElectricBike eb=new ElectricBike();
		eb.brand="HERO";
		eb.price=150000;
		eb.colour="Red";
		eb.batteryCapacity=150;
		System.out.println(eb.brand+eb.price+eb.colour+eb.batteryCapacity);
		
	}

}
