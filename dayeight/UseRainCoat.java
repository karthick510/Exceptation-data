package com.onesoft.dayeight;

public class UseRainCoat {
	public static void main (String [] args) {
		String [] a=args[0].split(",");
		RainCoat raincoat1=new RainCoat();
		raincoat1.brand=(a[0]);
		raincoat1.color=(a[1]);
		raincoat1.price=Integer.parseInt(a[2]);
		raincoat1.taxAmount=Integer.parseInt(a[3]);
		
		String [] b=args[1].split(",");
		RainCoat raincoat2=new RainCoat();
		raincoat2.brand=(b[0]);
		raincoat2.color=(b[1]);
		raincoat2.price=Integer.parseInt(b[2]);
		raincoat2.taxAmount=Integer.parseInt(b[3]);
		
		String [] c=args[2].split(",");
		RainCoat raincoat3=new RainCoat();
		raincoat3.brand=(c[0]);
		raincoat3.color=(c[1]);
		raincoat3.price=Integer.parseInt(c[2]);
		raincoat3.taxAmount=Integer.parseInt(c[3]);
		
		RainCoat [] raincoats= {raincoat1,raincoat2,raincoat3};
				for(int i=0; i<raincoats.length; i++) {
			if(raincoats[i].price<800) {
				
											}
			System.out.println(raincoats[i].brand+" ");
			
		}
		
				
		
	}

}
class RainCoat {
	String brand;
	String color;
	int price;
	int taxAmount;
	int netprice=price+taxAmount;
}