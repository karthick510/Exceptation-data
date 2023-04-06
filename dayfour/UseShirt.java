package com.onesoft.dayfour;

public class UseShirt {
	public static void main(String [] args) {
		Shirt s=new Shirt();
		String[]s1=args[0].split(",");
		s.brand=s1[0];
		s.price=Integer.parseInt(s1[1]);
		s.size=s1[2].charAt(0);
		s.isChecked=Boolean.parseBoolean(s1[3]);
		s.discountpercentage=Integer.parseInt(s1[4]);
		s.netprice=(s.price-(s.price*s.discountpercentage/100));
		System.out.println("Brand="+s.brand+" Size="+s.size+" Netprice="+s.netprice);
	}

}
 class Shirt {
	 String brand;
	 int price;
	 char size;
	 boolean isChecked;
	 int discountpercentage;
	 int netprice;
 }