package com.onesoft.daynine_oop;

public class UsePen {
	public static void main (String [] args) {
		Refill r=new Refill();
		r.setBrand("Hero");
		r.setPrice(75);
		r.setColour("Red");
		Pen p=new Pen();
		p.setBrand("Heroo");
		p.setPrice(150);
		p.setRefill(r);
		System.out.println(p.getRefill().getBrand());
		System.out.println(p.getBrand());
	}

}
