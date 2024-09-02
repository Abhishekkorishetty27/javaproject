package com.xworkz.today.Practice;

public class Book {
	
	    
	    String title;
	    String author;
	    int pages;
	    String genre;
	    double price;

	   
	    public Book() {
	        
	    }

	    public Book(String title) {
	    	 System.out.println(this.title = title);
	    }

	    public Book(String title, String author) {
	    	 System.out.println(this.title = title);
		        System.out.println(this.author = author);
	    }

	    public Book(String title, String author, int pages) {
	    	 System.out.println(this.title = title);
		        System.out.println(this.author = author);
		        System.out.println(this.pages = pages);
	    }

	    public Book(String title, String author, int pages, String genre) {
	    	  System.out.println(this.title = title);
		        System.out.println(this.author = author);
		        System.out.println(this.pages = pages);
		        System.out.println(this.genre = genre);
	    }

	    public Book(String title, String author, int pages, String genre, double price) {
	        System.out.println(this.title = title);
	        System.out.println(this.author = author);
	        System.out.println(this.pages = pages);
	        System.out.println(this.genre = genre);
	        System.out.println(this.price = price);
	    }
	}


