package com.onesoft.daynine_oop;

public class UseAc {
	public static void main (String [] args) {
		Compressor c=new Compressor ();
		c.brand="Flexic";
		c.price=20000;
		c.capacity=210;
		
		Ac a=new Ac();
		a.brand="Whirlpool";
		a.price=60000;
		a.compressor=c;
		System.out.println("Ac Brand="+a.brand+" Ac Price="+a.price);
		System.out.println("Compressor Brand="+a.compressor.brand+" Compressor Price="+a.compressor.price+" Compressor  Price="+a.compressor.price);
	}

}
