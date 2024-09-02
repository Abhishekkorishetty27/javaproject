package com.xworkz.today.Practice;

public class Person {
	    String name;
	    int age;
	    String gender;
	    String address;
	    String occupation;

	    public Person() {
	      
	    }

	    public Person(String name) {
	    	 System.out.println( this.name = name);
	      
	       
	    }

	    public Person(String name, int age) {
	    	 System.out.println( this.name = name);
		       System.out.println(this.age = age);
	      
	    }

	    public Person(String name, int age, String gender) {
	    	 System.out.println( this.name = name);
		       System.out.println(this.age = age);
		       System.out.println(this.gender = gender);
	      
	    }

	    public Person(String name, int age, String gender, String address) {
	    	 System.out.println( this.name = name);
		       System.out.println(this.age = age);
		       System.out.println(this.gender = gender);
		       System.out.println(this.address = address);	        
	    }

	    public Person(String name, int age, String gender, String address, String occupation) {
	       System.out.println( this.name = name);
	       System.out.println(this.age = age);
	       System.out.println(this.gender = gender);
	       System.out.println(this.address = address);
	       System.out.println(this.occupation = occupation);
	    }
	}

