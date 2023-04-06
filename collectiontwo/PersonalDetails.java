package com.onesoft.collectiontwo;

public class PersonalDetails {
	
		private String name;
		private long addharnumber;
		private int age;
		String gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getAddharnumber() {
			return addharnumber;
		}
		public void setAddharnumber(long addharnumber) {
			this.addharnumber = addharnumber;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public PersonalDetails() {
			super();
			
		}
		public PersonalDetails(String name, long addharnumber, int age, String gender) {
			super();
			this.name = name;
			this.addharnumber = addharnumber;
			this.age = age;
			this.gender = gender;
		}
	
		public String toString() {
			return "PersonalDetails [name=" + name + ", addharnumber=" + addharnumber + ", age=" + age + ", gender="
					+ gender + "]";
		}
		
	}


