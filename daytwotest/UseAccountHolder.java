package com.onesoft.daytwotest;

public class UseAccountHolder {
	public static void main(String [] args) {
		AccountHolder a1=new AccountHolder();
		a1.name="mano";
		a1.age=26;
		a1.gender="Male";
		a1.accountnumber=28330485612583l;
		a1.monthlyincome=21000;
		a1.savingsPercentage=18;
		a1.savingsamount=a1.monthlyincome*a1.savingsPercentage/100;
		System.out.println("Amount="+a1.savingsamount);
		
		AccountHolder a2=new AccountHolder();
		a2.name="Savithri";
		a2.age=25;
		a2.gender="FeMale";
		a2.accountnumber=28330485612584l;
		a2.monthlyincome=20000;
		a2.savingsPercentage=20;
		a2.savingsamount=a2.monthlyincome*a2.savingsPercentage/100;
		System.out.println("Amount="+a2.savingsamount);
		
		AccountHolder a3=new AccountHolder();
		a3.name="Kamban";
		a3.age=30;
		a3.gender="Male";
		a3.accountnumber=283304856125845l;
		a3.monthlyincome=30000;
		a3.savingsPercentage=10;
		a3.savingsamount=a3.monthlyincome*a3.savingsPercentage/100;
		System.out.println("Amount="+a3.savingsamount);
	}
	
	
	

}
