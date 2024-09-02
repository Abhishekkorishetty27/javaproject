package com.xworkz.today.assignment;
public class Person {
    public String name;
    public int age;
    public String gender;
    public double height;
    public double weight;
    public String nationality;
    public String occupation;
    public String address;
    public String phoneNumber;
    public String email;

    
    public Person(String name, int age, String gender, double height, double weight, String nationality, String occupation, String address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.occupation = occupation;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void getDetails(){
        System.out.println("name: " + name+"age: " + age+"gender: " + gender+"height: " + height+"weight: " + weight +"nationality: " + nationality+"occupation: " + occupation+"adress: " + address+"phonenumber: " + phoneNumber+"email: " + email);
    }
}  