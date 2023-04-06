package com.onesoft.n;

public class UseNote {
	public static void main (String [] args) {
		Note n1=new Note("Nataraj",80,"Black",true,true);
		Note n2=new Note("Ranjith",75,"Blue",true,false);
		Note [] notes= {n1,n2};
		for(int i=0; i<notes.length; i++ ) {
			System.out.println(notes[i]);
		}
	}

}
