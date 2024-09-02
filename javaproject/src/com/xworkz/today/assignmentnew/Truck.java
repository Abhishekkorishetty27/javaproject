package com.xworkz.today.assignmentnew;

public class Truck {
	public String driveType;
	public int capacity;
	public boolean bed;
	public String fuel;
	
	
	
    public Truck(String driveType) {
    	this("gg",4);
    	System.out.println("1 argument");
    	this.driveType=driveType;
    }
    public Truck(String driveType,int capacity) {
    	this("ghfgc",2,true);
    	System.out.println("2 argument");
    	this.driveType=driveType;
    	this.capacity=capacity;
		
	}
    public Truck(String driveType,int capacity,boolean bed) {
    	System.out.println("3 argument");
    	this.driveType=driveType;
    	this.capacity=capacity;
    	this.bed=bed;
		
	}
    public Truck(String driveType,int capacity,boolean bed,String fuel) {
    	this("fgghcgfc");
    	System.out.println("4 argument");
    	this.driveType=driveType;
    	this.capacity=capacity;
    	this.bed=bed;
		this.fuel=fuel;
	}
}
