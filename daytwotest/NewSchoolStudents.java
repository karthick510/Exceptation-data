package com.onesoft.daytwotest;

public class NewSchoolStudents {
	public static void main(String [] args) {
		SchoolStudents s1=new SchoolStudents();
		s1.studentName="Hari";
		s1.studentAge=15;
		s1.mobileNo=9565471245l;
		s1.section='A';
		s1.markPercentage=84;
		System.out.println(s1.studentName+" "+s1.studentAge+" "+s1.mobileNo+" "+s1.section+" "+s1.markPercentage);
		System.out.println("Name="+s1.studentName+" Percentage="+s1.markPercentage);
		
		SchoolStudents s2=new SchoolStudents();
		s2.studentName="Kumar";
		s2.studentAge=16;
		s2.mobileNo=9864153248l;
		s2.section='B';
		s2.markPercentage=86;
		System.out.println(s2.studentName+" "+s2.studentAge+" "+s2.mobileNo+" "+s2.section+" "+s2.markPercentage);
		
		SchoolStudents s3=new SchoolStudents();
		s3.studentName="Sundar";
		s3.studentAge=17;
		s3.mobileNo=7485961236l;
		s3.section='B';
		s3.markPercentage=86;
		System.out.println(s3.studentName+" "+s3.studentAge+" "+s3.mobileNo+" "+s3.section+" "+s3.markPercentage);
		
	}
	
	

}
