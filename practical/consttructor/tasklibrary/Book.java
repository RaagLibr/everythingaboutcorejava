package com.enfy.consttructor.tasklibrary;

public class Book {

	int bookid;
	String title;
	String author;
	String isbn;
	boolean available;
	
	
	

	public Book(int bookid, String title, String author, String isbn) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = true;
	}
	
	
	


	public void borrowBook()
	{
		this.available=false;
		System.out.println("book id "+this.bookid+"author "+this.author+"isbn "+this.isbn+"availabel="+this.available);
	}
	
	public void returnBook()
	{
		this.available=true;
		System.out.println("book id "+this.bookid+"author "+this.author+"isbn "+this.isbn+"availabel= "+this.available);
		
	}
	
	
	public void availabilitybook()
	{
		System.out.println("book id"+this.bookid+"author"+this.author+"isbn "+this.isbn+"available= "+this.available);
		
	}
	
}
