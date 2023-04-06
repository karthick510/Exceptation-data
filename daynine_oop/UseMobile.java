package com.onesoft.daynine_oop;

public class UseMobile {
	public static void main (String [] args) {
		Display d1=new Display("REDO",5500,3);
		Mobile m1=new Mobile("OPPO",25000,d1);
		Display d2=new Display("GEGO",4000,2);
		Mobile m2=new Mobile("SAMSUNG",20000,d2);
		
		Mobile[] mobiles= {m1,m2};
		for(int i=0; i<mobiles.length; i++) {
		if(mobiles[i].display.price>5000) {
				System.out.println(mobiles[i].price+500);
			}
		}
				
	}

}
