package com.xworkz.today.assignmentnew;

public class MyClass {
    public int property1;
    public String property2;
    public double property3;
    public boolean property4;


    public MyClass() {
        this(0, "", 0.0, false);
        System.out.println("this is o argument");
    }

    
    public MyClass(int property1, String property2) {
        this(property1, property2, 0.0, false);
        System.out.println("this is 2 argument");

        this.property1 = property1;
        this.property2 = property2;
    }

 
    public MyClass(int property1, String property2, double property3) {
        this(property1, property2, property3, false);
        System.out.println("this is 3 argument");

        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }

    public MyClass(int property1, String property2, double property3, boolean property4) {
        System.out.println("this is 4 argument");

        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
        this.property4 = property4;
    }
}