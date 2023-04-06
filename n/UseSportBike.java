package com.onesoft.n;

public class UseSportBike {
	public static void main (String [] args) {
		SportsBike sb=new SportsBike ();
		sb.brand="HERO";
		sb.price=750000;
		sb.colour="Yellow";
		sb.weight=30;
		System.out.println(sb.brand+sb.price+sb.colour+sb.weight);
	}

}
