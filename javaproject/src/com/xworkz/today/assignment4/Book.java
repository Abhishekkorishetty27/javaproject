package com.xworkz.today.assignment4;

public class Book {
	
	    public String title;
	    public String author;
	    public String ISBN;
	    public int publicationYear;
	    public String genre;
	    public int pages;
	    public String publisher;
	    public boolean isHardcover;
	    public double price;
	    public String language;

	  
	    public Book(String title, String author, String ISBN, int publicationYear, 
	                String genre, int pages, String publisher, boolean isHardcover, 
	                double price, String language) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	        this.publicationYear = publicationYear;
	        this.genre = genre;
	        this.pages = pages;
	        this.publisher = publisher;
	        this.isHardcover = isHardcover;
	        this.price = price;
	        this.language = language;
	    }
	    public void details() {
	    	System.out.println(title);
	    	System.out.println(author);
	    	System.out.println(ISBN);
	    	System.out.println(publicationYear);
	    	System.out.println(genre);
	    	System.out.println(pages);
	    	System.out.println(publisher);
	    	System.out.println(isHardcover);
	    	System.out.println(price);
	    	System.out.println(language);

	    	
	    }
	    
	    
	}



