package com.xworkz.today.literal;

public class Person {
	    
	    String name;
	    int age;
	    String gender;
	    double height;
	    double weight;
	    String occupation;
	    String country;
	    String city;

	   
	    public Person(String name, int age, String gender, double height, double weight, String occupation, String country, String city) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.height = height;
	        this.weight = weight;
	        this.occupation = occupation;
	        this.country = country;
	        this.city = city;
	    }

	    
	    public Person() {}

		public void personDetails() {
			// TODO Auto-generated method stub
			System.out.println(name);
			System.out.println(age);

			System.out.println(gender);

			System.out.println(height);

			System.out.println(weight);

			System.out.println(occupation);

			System.out.println(country);

			System.out.println(city);

		}
	}




 
