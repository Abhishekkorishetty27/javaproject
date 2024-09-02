package com.xworkz.today.assignment3;

public class House {
	    public String address;
	    public int numOfBedrooms;
	    public int numOfBathrooms;
	    public double sizeInSquareFeet;
	    public String type;
	    public int yearBuilt;
	    public String ownerName;
	    public boolean hasGarage;
	    public boolean hasGarden;
	    public double price;

	    
	    public House(String address, int numOfBedrooms, int numOfBathrooms, double sizeInSquareFeet, 
	                 String type, int yearBuilt, String ownerName, boolean hasGarage, 
	                 boolean hasGarden, double price) {
	        this.address = address;
	        this.numOfBedrooms = numOfBedrooms;
	        this.numOfBathrooms = numOfBathrooms;
	        this.sizeInSquareFeet = sizeInSquareFeet;
	        this.type = type;
	        this.yearBuilt = yearBuilt;
	        this.ownerName = ownerName;
	        this.hasGarage = hasGarage;
	        this.hasGarden = hasGarden;
	        this.price = price;
	    }
	    public void details() {
	    	System.out.println(address);
	    	System.out.println(numOfBedrooms);
	    	System.out.println(numOfBathrooms);
	    	System.out.println(sizeInSquareFeet);
	    	System.out.println(type);
	    	System.out.println(yearBuilt);
	    	System.out.println(ownerName);
	    	System.out.println(hasGarage);
	    	System.out.println(hasGarden);
	    	System.out.println(price);





	    }
	   
	}



