package com.onesoft.daytwotest;

public class UsePen {
	public static void main(String [] args) {
		Pen p=new Pen();
		p.brand="Reynolds";
		p.price=30;
		p.isbluecolor=true;
		p.tipWidth=0.5f;
		
		
		Pen p1=new Pen();
		p1.brand="Parker";
		p1.price=80;
		p1.isbluecolor=true;
		p1.tipWidth=0.6f;
		
		Pen p2=new Pen();
		p2.brand="Remo";
		p2.price=40;
		p2.isbluecolor=false;
		p2.tipWidth=0.4f;
		int.average=p.price+p1.price+p2.price;
		System.out.println=("Average="(p.price+p1.price+p2.price/3);
	}

}
