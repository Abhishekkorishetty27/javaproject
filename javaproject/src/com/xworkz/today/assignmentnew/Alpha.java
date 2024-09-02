package com.xworkz.today.assignmentnew;

class Alpha {
    int prop1;
    int prop2;
    int prop3;
    int prop4;

 
    public Alpha() {

        this(0, 0, 0, 0); 
        System.out.println("this is 1 argument ");
    }
    
    public Alpha(int prop1) {
        this(prop1, 0); 
		System.out.println("this is 1 argument");

    }

   
    public Alpha(int prop1, int prop2) {
        this(prop1, prop2, 0, 0); 
		System.out.println("this is 2 argument");

    }

    
    public Alpha(int prop1, int prop2, int prop3, int prop4) {
    
		System.out.println("this is 4 argument");

        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
        this.prop4 = prop4;
    }
}