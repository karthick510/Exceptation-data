package com.onesoft.collectone;

import java.util.ArrayList;

public class Country {
	public static void main (String [] args) {
		ArrayList<String>cn=new ArrayList<>();
		cn.add("India");
		cn.add("Japan");
		cn.add("China");
		cn.add("Nepal");
		cn.add("Italy");
		cn.add("Iran");
		 String min=cn.get(0);
		for(String x:cn) {
			if(x.contains("a")||x.contains("e")||x.contains("i")||x.contains("o")||x.contains("u")) {
				System.out.println("Contains Vowels");
		}
			else {
				System.out.println("Not Vowel");
			}
						}
		for(int i=0; i<cn.size(); i++) {
			if(!cn.get(i).endsWith("a")) {
				System.out.println(cn.get(i));
			}
				}
		for(String y:cn) {
			if(y.length()<min.length()) {
				min=y;
			}
		}
		System.out.println(min);
		for(int i=0; i<cn.size();i++) {
			System.out.println((cn.get(i).charAt(cn.get(i).length()-1)));
		}

	}
}
