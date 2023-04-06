package com.onesoft.collectionthree;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String [] args) {
		Student s1=new Student("Kavi",510,'A',85,true,"O+ve");
		Student s2=new Student("Kajesh",512,'A',91,true,"O-ve");
		Student s3=new Student("Singh",632,'B',94,true,"AB+ve");
		Student s4=new Student("Vignesh",644,'B',90,true,"B+ve");
		ArrayList <Student>std=new ArrayList <>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		
		std.stream().forEach(x->System.out.println(x));
		List<Student>a=std.stream().collect(Collectors.toList());
		a.forEach(m->System.out.println(m));
		
		std.stream().filter(z->z.getBloodGroup().equals("B+ve")).forEach(y->System.out.println(y));
		List<Student>b=std.stream().filter(f->f.getBloodGroup().equals("B+ve")).collect(Collectors.toList());
		b.forEach(n->System.out.println(n));
		
		std.stream().map(k->k.isPresent()).forEach(l->System.out.println(l));
		List<Boolean>s=std.stream().map(y->y.isPresent()).collect(Collectors.toList());
		s.forEach(f->System.out.println(f));
		
		std.stream().filter(g->getRollNum()>510).map(h->h.getName()).forEach(i->System.out.println(i));
		List<String>w=std.stream().filter(q->getRollNum()>510).map(e->e.getName()).collect(Collectors.toList());
		w.forEach(d->System.out.println(d));
		
		std.stream().map(j->j.getAvg()).filter(p->p>=90).forEach(c->System.out.println(c));
		List<Integer>t=std.stream().map(j->j.getAvg()).filter(p->p>=90).collect(Collectors.toList());
		t.forEach(u->System.out.println(u));
		
		long xy=b.stream().count();
		System.out.println(xy);
		long xyz=std.stream().filter(zz->zz.getName().startsWith("K")).count();
		System.out.println(xyz);
	}

	private static int getRollNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
