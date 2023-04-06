package com.onesoft.zhomework;

import java.util.HashMap;

public class UseBike {
	public static void main (String [] args) {
		Bike b1=new Bike(4525,"Hero","Black");
		Bike b2=new Bike(3561,"KTM","Yellow");
		Bike b3=new Bike(7514,"Yamaha","Red");
		Bike b4=new Bike(8614,"Hond","Brown");
		Bike b5=new Bike(9678,"BMW","Grey");
		HashMap<Integer,Bike>bk=new HashMap<>();
		bk.put(b1.getNumberplate(),b1);
		bk.put(b2.getNumberplate(),b2);
		bk.put(b3.getNumberplate(),b3);
		bk.put(b4.getNumberplate(),b4);
		bk.put(b5.getNumberplate(),b5);
		for(Integer x:bk.keySet()){
			if(x%2==0) {
			System.out.println(x);
			}
		}
		for(Bike y:bk.values()) {
			if(y.getBrand().startsWith("H")) {
			System.out.println("Good one");
		}
		for(Integer x:bk.keySet()) {
			System.out.println(bk.get(x));
		}
			//bk.forEach((m,n)->System.out.println(n));
		//bk.values().forEach(m->System.out.println(m));
	//bk.keySet().forEach(n->System.out.println(n));
		//bk.keySet().forEach(p->System.out.println(bk.get(p)));
}
		
	}
}

