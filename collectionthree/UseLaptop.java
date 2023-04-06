package com.onesoft.collectionthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class UseLaptop {
	public static void main (String [] args) {
		Laptop l1=new Laptop("Dell",60000,"Intel",false,"Red");
		Laptop l2=new Laptop("Hp",78000,"Celeron",true,"Black");
		Laptop l3=new Laptop("Apple",150000,"PentiumII",true,"Brown");
		Laptop l4=new Laptop("Dell",94000,"Xeon",true,"Grey");
		Laptop l5=new Laptop("Samsung",80000,"Mcs",false,"White");
		Laptop l6=new Laptop("Lenova",98000,"Quark",true,"Ash");
		ArrayList<Laptop>lap=new ArrayList<>();
		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
		lap.add(l4);
		lap.add(l5);
		lap.add(l6);
		List<Laptop>a=lap.stream().filter(b->b.isTouchScreen()==(true) &&b.getColor().equals("Black")).collect(Collectors.toList());
		a.forEach(z->System.out.println(z));
		List<String>c=lap.stream().map(y->y.getProcessor()).collect(Collectors.toList());
		c.forEach(k->System.out.println(k));
		long xy=a.stream().count();
		System.out.println(xy);
		List<Integer>k=lap.stream().filter(l->l.isTouchScreen()==(false)).map(m->m.getPrice()).collect(Collectors.toList());
		k.forEach(o->System.out.println(o));
		List<String>u=lap.stream().map(w->w.getBrand()).filter(d->d.equals("Apple")).collect(Collectors.toList());
		u.forEach(zz->System.out.println(zz));
//		Map<String,Laptop>laps=lap.stream().collect(Collectors.toMap(f->f.getBrand(),y->y));
//		laps.forEach((v,m)->System.out.println(v+" "+m));
		
		//Set<String>lapss=lap.stream().map(xx->xx.getBrand()).collect(Collectors.toSet());
		//lapss.forEach(yy->System.out.println(yy));
		
		List<String>lap2=lap.stream().map(xx->xx.getBrand()).distinct().collect(Collectors.toList());
		lap2.forEach(yy->System.out.println(yy));
		
		//List<Integer>lap3=lap.stream().map(zz->zz.getPrice()).sorted().collect(Collectors.toList());
		//lap3.forEach(cc->System.out.println(cc));
		
		List<Integer>lap4=lap.stream().map(zz->zz.getPrice()).limit(5).collect(Collectors.toList());
		lap4.forEach(dd->System.out.println(dd));

		
		
	}

	
}
