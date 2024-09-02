package com.xworkz.today.assignment2;

public class Car {
	    public String make;
	    public String model;
	    public int year;
	    public String color;
	    public double engineSize;
	    public String fuelType;
	    public int mileage;
	    public String vinNumber;
	    public boolean isElectric;
	    public String ownerName;

	
	    public Car(String make, String model, int year, String color, double engineSize, 
	               String fuelType, int mileage, String vinNumber, boolean isElectric, 
	               String ownerName) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	        this.engineSize = engineSize;
	        this.fuelType = fuelType;
	        this.mileage = mileage;
	        this.vinNumber = vinNumber;
	        this.isElectric = isElectric;
	        this.ownerName = ownerName;
	    }
	    public void display() {
	    	System.out.println(make);
	    	System.out.println(model);
	    	System.out.println(year);
	    	System.out.println(color);
	    	System.out.println(engineSize);
	    	System.out.println(fuelType);
	    	System.out.println(mileage);
	    	System.out.println(vinNumber);
	    	System.out.println(isElectric);
	    	System.out.println(ownerName);


	    }
	}
