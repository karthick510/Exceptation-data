package com.onesoft.function;

public class UseCollege {
	public static void main (String [] args) {
		College c1=new College ();
		c1.name="RVS";
		c1.fees=85000;
		c1.location="Thiruvallur";
		c1.grade='B';
		
		College c2=new College ();
		c2.name="AVC";
		c2.fees=95000;
		c2.location="Kanchipuram";
		c2.grade='A';
		
		College c3=new College ();
		c3.name="SJJ";
		c3.fees=105000;
		c3.location="Vellore";
		c3.grade='O';
		
		College [] colleges= {c1,c2,c3};
		System.out.println(c1.findMax(colleges));
		c3.findMin(colleges);
		
	}

}
