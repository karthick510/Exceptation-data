package com.onesoft.daynine_oop;

public class UseChair {
	public static void main (String [] args) {
		Wood w=new Wood ();
		w.setBrand("Supreme");
		w.setPrice(1500);
		w.setWeight(3);
		Chair c=new Chair ();
		c.setBrand("Extreme");
		c.setPrice(2500);
		c.setWood(w);
		System.out.println(c.getWood().getBrand()+" "+c.getWood().getPrice()+" "+c.getWood().getWeight());
		System.out.println(c.getBrand()+" "+c.getPrice());
	}

}
