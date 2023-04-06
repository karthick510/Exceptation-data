package com.onesoft.collectone;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String [] args) {
		Employee e1=new Employee("Rajesh",522,30000,"Profeesor",true);
		Employee e2=new Employee("Selvi",427,45000,"tester",false);
		Employee e3=new Employee("Kumar",308,78000,"Developer",true);
		Employee e4=new Employee("Rajesh",231,10000,"Driver",true);
		ArrayList <Employee>emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		for (int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i));
		}
		for (int i=emp.size()-1; i>=0; i--) {
			System.out.println(emp.get(i));
		}
		for(Employee x: emp) {
			System.out.println(x);
			
		}
		emp.forEach(z->System.out.println(z));
		Employee max=emp.get(0);
		for (int i=0;i<emp.size();i++) {
			if(emp.get(i).getId()>max.getId()) {
				max=emp.get(i);
				System.out.println(max);
		}
		}
		emp.forEach(x-> {
			if(x.getSalary()>=50000) {
				System.out.println(x);
			}
			});
		for(Employee u: emp) {
			if(!u.getIsMale()) {
				System.out.println(u);
			}
		}
		for (int i=0; i<emp.size(); i++) {
			if(emp.get(i).getRole().equals("Developer")) {
				System.out.println(emp.get(i).getName()+" "+emp.get(i).getSalary());
			}
		}
		ArrayList<Employee>femaleList=new ArrayList<>();
		emp.forEach(m-> {
			if(m.getIsMale()!=true) {
				femaleList.add(m);
			}
		});
			
		System.out.println(femaleList);
		femaleList.forEach(m->System.out.println(m));
		
		ArrayList<Employee>nameList=new ArrayList<>();
		emp.forEach(g-> {
			
			if(g.getName().equals("Rajesh")) {
				nameList.add(g);
			}
		});
			
		System.out.println(nameList);
		nameList.forEach(g->System.out.println(g));

	}
	}



