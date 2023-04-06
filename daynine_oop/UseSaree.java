package com.onesoft.daynine_oop;

public class UseSaree {
	public static void main (String [] args) {
		Saree s1=new Saree("Parampara",5000,"red",true);
		Saree s2=new Saree("Samuthirika",5500,"blue",true);
		Saree s3=new Saree("Alaya",4500,"black",true);
		Saree s4=new Saree("ChennaiSilks",6000,"green",true);
		Saree s5=new Saree("Pothys",4000,"purple",true);
		Saree [] sarees= {s1,s2,s3,s4,s5};
		Saree temp=sarees[0];
		for(int i=0; i<sarees.length; i++) {
			if (sarees[i].getPrice()>temp.getPrice()) {
				temp=sarees[i];
			}
		}
		System.out.println(temp);
	}

}
