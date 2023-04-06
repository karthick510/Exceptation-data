package com.onesoft.n;

public class UseSportsCar {
	public static void main (String [] args) {
		SportsCar s1=new SportsCar ();
		s1.brand="Mc Laren";
		s1.price=750000;
		s1.isPetrol=true;
		s1.weight=45.3f;
		System.out.println(s1.findnetprice(s1.price));
		

}
}
