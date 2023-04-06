package com.onesoft.n;

public class Note extends Stationery{ 
  boolean isRuled;
  boolean isLong;
  
 public Note(String brand,int price,String colour,boolean isRuled, boolean isLong) {
	 super(brand,price,colour);
	 this.isRuled=isRuled;
	 this.isLong=isLong;
	
}
 public String toString() {
	 return ("isRuled"+"isLong"+super.toString ());
 }
  
}
