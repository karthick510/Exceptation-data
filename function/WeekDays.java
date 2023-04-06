package com.onesoft.function;

public class WeekDays {
	public void findTheday (String day) {
		switch (day){
		case "Sunday":System.out.println( "It is a Firstday");break;
		case "Monday":System.out.println( "It is a Secondday");break;
		case "Tuesday":System.out.println( "It is a Thirdday");break;
		case "Wenesday":System.out.println( "It is a Fourthday");break;
		case "Thursday":System.out.println( "It is a Fifthday");break;
		case "Friday":System.out.println( "It is a Sixthday");break;
		case "Saturday":System.out.println( "It is a Seventhday");break;
		default:System.out.println("Invalid");break;
		}
	
	}

}
