package com.onesoft.collectone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
	public static void main (String [] args) {
		// List<Integer> lmsIds= Arrays.asList(576,64656,5936,5481,4457);
		ArrayList<Integer>lmsIds=new ArrayList <>();
		lmsIds.add(571);
		lmsIds.add(1099);
		lmsIds.add(1102);
		lmsIds.add(1101);
		int max=lmsIds.get(0);
		for(int i=0; i<lmsIds.size(); i++) {
			System.out.println(lmsIds.get(i));
		}
		for(Integer x:lmsIds) {
			System.out.println(x);
		}
		lmsIds.forEach(z->System.out.println(z));
		lmsIds.forEach(z->{System.out.println(z);});
		
		for(Integer x:lmsIds) {
			if(x%2==0) {
				System.out.println("EVEN NUMBER");
			}
			else {
				System.out.println("Odd NUMBER");
			}
		}
		for(int i=0; i<lmsIds.size(); i++) {
			if(lmsIds.get(i)>max) {
				max=lmsIds.get(i);
			}
			
		}
		System.out.println(max);
	}

}
