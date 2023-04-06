package com.onesoft.daytwotrain;

public class Yes {
	public static void main (String [] args) {
		String [] values=args[0].split(":");
		int count=0;
		for(int i=0; i<values.length; i++) {
			if(values[i].toLowerCase()==values[i]) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("yes");
		}

	
		
	}
	
}
