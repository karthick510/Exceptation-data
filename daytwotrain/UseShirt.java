package com.onesoft.daytwotrain;

public class UseShirt {
	public static void main(String [] args) {
		Shirt s=new Shirt();
		s.brand="OTTO";
		s.price=2000;
		s.discountamount=400;
		s.netprice=s.price-s.discountamount;
		System.out.println("Brand="+s.brand+" Netprice="+s.netprice);
		
		Shirt s1=new Shirt();
		s1.brand="Peter england";
		s1.price=4500;
		s1.discountpercentage=10;
		s1.netprice=s1.price-(s1.price*s1.discountpercentage/100);
		System.out.println("Brand="+s1.price+" Netprice="+s1.netprice);
		System.out.println("Average=" +(s.price+s1.price)/2);
	}

}
