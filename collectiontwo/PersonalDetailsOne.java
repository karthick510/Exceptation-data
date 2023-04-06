package com.onesoft.collectiontwo;

import java.util.HashMap;

public class PersonalDetailsOne {
	public static void main (String [] args) {
		PersonalDetails p1=new PersonalDetails("Karthick",124547892369l,32,"Male");
		PersonalDetails p2=new PersonalDetails("Singh",134569874512l,28,"Male");
		PersonalDetails p3=new PersonalDetails("Vignesh",189234571896l,36,"Male");
		PersonalDetails p4=new PersonalDetails("Ravi",986321457896l,14,"Male");
		PersonalDetails p5=new PersonalDetails("Rajesh",789432147896l,22,"Male");
		PersonalDetails p6=new PersonalDetails("Kavitha",647931247896l,37,"Female");
		PersonalDetails p7=new PersonalDetails("Kumar",557712367894l,45,"Male");
		HashMap<Long,PersonalDetails> pd=new HashMap<>();
		
		for(PersonalDetails x:pd.values()) {
			if(x.getAge()>18) {
				System.out.println(x);
			}
	
		
	}
	
	}
}
