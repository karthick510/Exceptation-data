package com.onesoft.daynine_oop;

public class UsePenn {
	public static void main (String [] args) {
		Refil r=new Refil ("ZZ5D",55,"Black");
		Penn p=new Penn ("Hero",80,r);
		System.out.println(p.refil.brand);
	}

}
