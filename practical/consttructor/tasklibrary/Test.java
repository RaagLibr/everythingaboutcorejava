package com.enfy.consttructor.tasklibrary;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk=new Book(123,"academy","james goslings","ABC123");
		bk.borrowBook();
		bk.returnBook();
		bk.availabilitybook();
		
		Book bk1=new Book(123,"academy","james goslings","ABC123");
		bk1.returnBook();
		bk1.availabilitybook();
		
	}

}
