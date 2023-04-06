package com.onesoft.dayeight;

public class UseMobile {
	public static void main (String [] args) {
		Mobile m1=new Mobile ();
		m1.brand="Samsung";
		m1.price=25000;
		m1.colour="pink";
		m1.is5g=true;
		
		Mobile m2=new Mobile ();
		m2.brand="Redmi";
		m2.price=22000;
		m2.colour="white";
		m2.is5g=true;
		
		Mobile m3=new Mobile ();
		m3.brand="Oppo";
		m3.price=27000;
		m3.colour="green";
		m3.is5g=true;
		
		Mobile m4=new Mobile ();
		m4.brand="Poco";
		m4.price=28000;
		m4.colour="brown";
		m4.is5g=true;
		
		Mobile m5=new Mobile ();
		m5.brand="Realme";
		m5.price=19000;
		m5.colour="Orange";
		m5.is5g=true;
		
		Mobile m6=new Mobile ();
		m6.brand="Oneplus";
		m6.price=21000;
		m6.colour="Red";
		m6.is5g=true;
	
		Mobile m7=new Mobile ();
		m7.brand="Nokia";
		m7.price=26000;
		m7.colour="Blue";
		m7.is5g=true;
		
		Mobile m8=new Mobile ();
		m8.brand="Sony";
		m8.price=27500;
		m8.colour="Black";
		m8.is5g=true;
		
		Mobile m9=new Mobile ();
		m9.brand="LG";
		m9.price=23500;
		m9.colour="Purpple";
		m9.is5g=true;
		
		Mobile m10=new Mobile ();
		m10.brand="Vivo";
		m10.price=22500;
		m10.colour="Violet";
		m10.is5g=true;
		
		Mobile[] mobiles= {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};
		Mobile temp=mobiles[0];
			for(int i=0; i<mobiles.length; i++) {
			if(mobiles[i].price>25000) {
				if(mobiles[i].price>temp.price) {
					temp=mobiles[i];
			System.out.println(mobiles[i].brand+" "+mobiles[i].price+" "+ mobiles[i].colour);
		}
			}
			}
			System.out.println(temp.price+" "+temp.brand);
		}
	}


