package com.onesoft.collectiontwo;

import java.util.HashMap;

public class PersonalDetailsTwo {
	public static void main (String [] args) {
		PersonalDetails p1=new PersonalDetails("Karthick",124547892369l,32,"Male");
		PersonalDetails p2=new PersonalDetails("Sngh",134569874512l,28,"Male");
		PersonalDetails p3=new PersonalDetails("Vignesh",189234571896l,36,"Male");
		PersonalDetails p4=new PersonalDetails("Ravi",986321457896l,14,"Male");
		PersonalDetails p5=new PersonalDetails("Rajesh",789432147896l,22,"Male");
		PersonalDetails p6=new PersonalDetails("Kavitha",647931247896l,37,"Female");
		PersonalDetails p7=new PersonalDetails("Kumar",557712367894l,45,"Male");
		HashMap<Long,PersonalDetails> pd=new HashMap<>();
		pd.put(p1.getAddharnumber(),p1);
		pd.put(p2.getAddharnumber(),p2);
		pd.put(p3.getAddharnumber(),p3);
		pd.put(p4.getAddharnumber(),p4);
		pd.put(p5.getAddharnumber(),p5);
		pd.put(p6.getAddharnumber(),p6);
		pd.put(p7.getAddharnumber(),p7);
		pd.values().forEach(x-> {
			if(x.getName().contains("a")||x.getName().contains("e")||x.getName().contains("i")||x.getName().contains("o")||x.getName().contains("u")){
				System.out.println("The word Contains vowel");
			}
				else {
					System.out.println("Not vowels");
				}
		});
	}
}
		
	

		


		


