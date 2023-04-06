package com.onesoft.daytwotest;

public class UseStudents {
	public static void main(String [] args) {
		Students s=new Students();
		s.name="siva";
		s.id=234;
		s.age=14;
		s.section="IX";
		s.totalworkingdays=240;
		s.attendancePercentage=75;
		s.numberofdayspresent=(s.totalworkingdays*s.attendancePercentage/100);
		System.out.println("No="+s.numberofdayspresent);
		
		Students s1=new Students();
		s1.name="mari";
		s1.id=236;
		s1.age=15;
		s1.section="X";
		s1.totalworkingdays=240;
		s1.attendancePercentage=80;
		s1.numberofdayspresent=(s1.totalworkingdays*s1.attendancePercentage/100);
		System.out.println("No="+s1.numberofdayspresent);
		
		Students s2=new Students();
		s2.name="Valli";
		s2.id=237;
		s2.age=13;
		s2.section="VIII";
		s2.totalworkingdays=240;
		s2.attendancePercentage=90;
		s2.numberofdayspresent=(s2.totalworkingdays*s2.attendancePercentage/100);
		System.out.println("No="+s2.numberofdayspresent);
		
		
	}
	
	

}
