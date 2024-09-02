package com.xworkz.today.assignmentnew;

public class Maths {
    public int number;
    public int many;
    public float how;
    public int digit;
	
	
    public Maths(int number) {
    	this(3,4);
    	System.out.println("1 argument");
    	this.number=number;
    }
    public Maths(int number,int many) {
    	this(23,34,3.4f);
    	System.out.println("2 argument");
    	this.number=number;
    	this.many=many;
		
	}
    public Maths(int number,int many,float how) {
    	System.out.println("3 argument");
    	this.number=number;
    	this.many=many;
    	this.how=how;
		
	}
    public Maths(int number,int many,float how,int digit) {
    	this(4);
    	System.out.println("4 argument");
    	this.number=number;
    	this.many=many;
    	this.how=how;
		this.digit=digit;
	}

}
