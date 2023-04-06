package com.onesoft.daythreetest;

public class UseLaptop {
	public static void main(String [] args) {
		Laptop l=new Laptop();
		l.brand="Dell";
		l.price=30000;
		l.color="Red";
		l.isWarranty=true;
		String r1=l.brand.toUpperCase();
		int r2=l.brand.length();
		boolean r3=l.brand.startsWith("D");
		char r4=l.brand.charAt(l.brand.length()-1);
		String r5=l.color.toLowerCase();
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
		
	}
	

}
