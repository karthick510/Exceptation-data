package com.onesoft.daynine_oop;

public class Saree {
	private String brand;
	private int price;
	private String colour;
	private boolean isHeavyWeight;
	 public void setBrand (String b) {
		 brand=b;
	 }
	 public String getBrand () {
		 return brand;
	 }
	 public void setPrice (int p) {
		 price=p;
	 }
	 public int getPrice () {
		 return price;
	 }
	 public void setColour (String c) {
		 colour=c;
	 }
	 public String getColour () {
		 return colour;
	 }
	 public void setisHeavyWeight (boolean d) {
		 isHeavyWeight=d;
	 }
	 public boolean getisHeavyWeight () {
		 return isHeavyWeight;		 
	 }
	 public Saree(String brand,int price,String colour,boolean isHeavyWeight) {
		 this.brand=brand;
		 this.price=price;
		 this.colour=colour;
		 this.isHeavyWeight=isHeavyWeight;
	 	 }
	 public String toString () {
		 return("Brand="+brand+" Price="+price+" Colour="+colour+" IsHeavyWeight="+isHeavyWeight);
	 }
 
}
