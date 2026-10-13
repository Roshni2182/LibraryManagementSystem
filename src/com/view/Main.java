package com.view;

import com.controller.Library;
import com.model.User;

public class Main {
	public static void main(String[] args) {
		Library.addUser("Rohan", 7896541330l);
		Library.addUser("Soham", 4562354790l);
		Library.printUserDetails();
		Library.addBook("Spider Man", "Stanlee", 1500, 15);
		Library.addBook("Harry Potter", "XYZ", 499, 10);
		Library.addBook("Musafir Cafe", "Prakash", 10, 2);
		Library.printBookDetails();
		Library.borrowBook("Harry Potter", "XYZ", 7);
		Library.printUserDetails();
	}
}
