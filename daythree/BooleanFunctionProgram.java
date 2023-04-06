package com.onesoft.daythree;

public class BooleanFunctionProgram {
	public static void main(String [] args) {
		String word="KarRthicK";
		boolean result1=word.contains("RtH");
		boolean result2=word.startsWith("Kar");
		boolean result3=word.endsWith("ick");
		boolean result4=word.equals("KarRthicK");
		boolean result5=word.equalsIgnoreCase("karthic");
		System.out.println(result1+" "+result2+" "+result3+" "+result4+" "+result5);
		
		
				
	}

}
