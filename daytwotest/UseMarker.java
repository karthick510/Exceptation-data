package com.onesoft.daytwotest;

public class UseMarker {
	public static void main(String [] args) {
		Marker m1=new Marker();
		m1.price=75;
		m1.colour="Blue";
		m1.weight=0.8f;
		m1.isQuality=true;
		System.out.println(m1.price+" "+m1.colour+" "+m1.weight+" "+m1.isQuality);
		System.out.println("Price="+m1.price+" Colour="+m1.colour);
		
		Marker m2=new Marker();
		m2.price=60;
		m2.colour="Red";
		m2.weight=0.9f;
		m2.isQuality=true;
		System.out.println(m2.price+" "+m2.colour+" "+m2.weight+" "+m2.isQuality);
		
		Marker m3=new Marker();
		m3.price=80;
		m3.colour="Green";
		m3.weight=0.75f;
		m3.isQuality=true;
		System.out.println(m3.price+" "+m3.colour+" "+m3.weight+" "+m3.isQuality);
		System.out.println("Colour="+m3.colour+" Weight="+m3.weight);
	
				
		
				
	}

}
