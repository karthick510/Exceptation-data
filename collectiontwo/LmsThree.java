package com.onesoft.collectiontwo;

import java.util.HashMap;

public class LmsThree {
	public static void main (String [] args) {
		HashMap <Integer,String> lms=new HashMap <> ();
		lms.put(508, "Vijayalakshmi");
		lms.put(1101, "Vignesh");
		lms.put(1102,"Singh");
		lms.put(1099, "Karthick");
		for(Integer x: lms.keySet()) {
		System.out.println(x);
		}
	}

}
