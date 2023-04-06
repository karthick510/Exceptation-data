package com.onesoft.daytwotrain;

public class UseAirConditioner {
	public static void main(String [] args) {
		AirConditioner a=new AirConditioner();
		a.brand="Croma";
		a.price=45000;
		a.tonne=2.5f;
		a.warranty="Five years";
		//System.out.println("Brand="+a.brand+" Price="+a.price+" Tonne="+a.tonne+" Warranty="+a.warranty);
		
		AirConditioner a1=new AirConditioner();
		a1.brand="LG";
		a1.price=42000;
		a1.tonne=2.3f;
		a1.warranty="Four years";
		//System.out.println("Brand="+a1.brand+" Price="+a1.price+" Tonne="+a1.tonne+" Warranty="+a1.warranty);
		
		AirConditioner a2=new AirConditioner();
		a2.brand="Whirlpool";
		a2.price=48000;
		a2.tonne=2.6f;
		a2.warranty="Six years";
		//System.out.println("Brand="+a2.brand+" Price="+a2.price+" Tonne="+a2.tonne+" Warranty="+a2.warranty);
	System.out.println(a+"\n"+a1+"\n"+a2+"\n");
	
	}

}
