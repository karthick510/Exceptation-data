package com.onesoft.daytwotrain;

public class UsePen {
	public static void main(String [] args) {
		Pen p=new Pen();
		p.colour="Red";
		p.price=75;
		p.brand="Hero";
		p.isInk=true;
		p.lidWidth=0.5f;
		System.out.println(p.colour+" "+p.price+" "+p.brand+" "+p.isInk+" "+p.lidWidth);
			
	}

}
