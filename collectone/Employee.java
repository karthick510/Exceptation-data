package com.onesoft.collectone;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String role;
	private boolean isMale;
	
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	public void setId(int b) {
		id=b;
	}
	public int getId() {
		return id;
	}
	public void setSalary(int c) {
		salary=c;
	}
	public int getSalary() {
		return salary;
	}
	public void setRole(String d) {
		role=d;
	}
	public String getRole() {
		return role;
	}
	public void setIsMale(boolean e) {
		isMale=e;
	}
	public boolean getIsMale() {
		return isMale;
	}
		public Employee(String name,int id,int salary,String role, boolean isMale){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.role=role;
		this.isMale=isMale;
	}
		public String toString () {
		return name+" "+isMale+" "+role+" "+id;
	}
	}

