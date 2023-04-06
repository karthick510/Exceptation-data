package com.onesoft.ms;

import java.util.ArrayList;

import com.onesoft.collectone.Employee;

public class Three {
	public static void main (String [] args) {
	Employee e1=new Employee("Rajesh",522,30000,"Profeesor",true);
	Employee e2=new Employee("Selvi",427,45000,"tester",false);
	Employee e3=new Employee("Kumar",308,78000,"Developer",true);
	Employee e4=new Employee("Rajesh",231,10000,"Driver",true);
	ArrayList <Employee>emp=new ArrayList<>();
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	System.out.println(find(emp));
	}
	public static ArrayList<Employee> find(ArrayList<Employee> emp){
		return emp;
	}

}
