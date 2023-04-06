package com.onesoft.dayeight;

public class UseAc2 {
	
		public static void main(String[] args) {
			Ac a1 = new Ac();
			a1.brand = "Croma";
			a1.ton = 2;
			a1.price = 45000;
			a1.star = 3;

			Ac a2 = new Ac();
			a2.brand = "Voltas";
			a2.ton = 3;
			a2.price = 55000;
			a2.star = 4;

			Ac a3 = new Ac();
			a3.brand = "Lg";
			a3.ton = 2;
			a3.price = 41000;
			a3.star = 2;

			Ac a4 = new Ac();
			a4.brand = "Whirlpool";
			a4.ton = 3;
			a4.price = 58000;
			a4.star = 4;

			Ac a5 = new Ac();
			a5.brand = "Bluestar";
			a5.ton = 4;
			a5.price = 65000;
			a5.star = 4;

			Ac a6 = new Ac();
			a6.brand = "Sony";
			a6.ton = 4;
			a6.price = 75000;
			a6.star = 4;

			Ac a7 = new Ac();
			a7.brand = "Phillips";
			a7.ton = 3;
			a7.price = 48000;
			a7.star = 3;

			Ac a8 = new Ac();
			a8.brand = "Oneplus";
			a8.ton = 3;
			a8.price = 51000;
			a8.star = 3;

			Ac a9 = new Ac();
			a9.brand = "Redmi";
			a9.ton = 4;
			a9.price = 75000;
			a9.star = 4;

			Ac a10 = new Ac();
			a10.brand = "Hihi";
			a10.ton = 2;
			a10.price = 45000;
			a10.star = 3;

			Ac[] acs = { a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 };
			int count = 0;
			int add = 0;
			for (Ac a:acs)
			{
				if (a.brand.equals("Voltas")) {
					System.out.println(("New Price of Voltas="+(a.price - 500)));
				}
				if (a.price > 50000) {
					count++;
				}
				if (a.star > 3) {
					System.out.println(a.brand);
				}
				if (a.ton == 2) {
					add = add + a.price;
				}
			}
			System.out.println("Price more than 50000=" + count);
			System.out.println("Price of 2ton ac="+add);

		}
	}


