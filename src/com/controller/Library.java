package com.controller;

import java.util.ArrayList;
import java.util.Scanner;
import com.model.*;

// Library class to  have all the functionalities
public class Library {
	// properties of the Library
	private static String name = "The House of Books";
	private static String address = "Sector V, Bidhannagar, 700102, Kolkata";
	private static long phoneNumber = 7410258963L;
	private static String librarian = "Akanshu Ojha";

	// creating scanner object to take user input
	private static Scanner sc = new Scanner(System.in);

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static ArrayList<User> alu = new ArrayList<User>();

	// creating a method in order to add user details to the library
	public static void addUser(String name, long phoneNumber) {
		for (User u : alu) {
			if (u.getPhoneNumber() == phoneNumber) {
				System.out.println("User already exists.");
				return;
			}
		}
		alu.add(new User(name, phoneNumber));
		System.out.println("User added .");
	}

	// in order to print the details of the user
	public static void printUserDetails() {
		for (User u : alu) {
			System.out.println(u);
			System.out.println("*******************************************************************************");
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// in order to store the book objects
	private static ArrayList<Book> alb = new ArrayList<Book>();

	// in order to add the books in the stock
	public static void addBook(String title, String author, double price, int quantity) {
		for (int i = 0; i < alb.size(); i++) {
			if (alb.get(i).getTitle().equalsIgnoreCase(title) && alb.get(i).getAuthor().equalsIgnoreCase(author)) {
				int stockQuantity = alb.get(i).getQuantity();
				alb.get(i).setQuantity(stockQuantity + quantity);
				System.out.println("Book added successfully.");
				return;
			}
		}
		alb.add(new Book(title, author, price, quantity));
		System.out.println("Book added successfully.");
	}

	// in order to print the details of the book
	public static void printBookDetails() {
		// for each loop
		for (Book b : alb) {
			System.out.println(b);
			System.out.println("*************************************");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// borrow method in order to provide books to the user
	public static void borrowBook(String title, String author, int quantity) {
		System.out.println("Provid your \"NAME\"");
		String name = sc.nextLine();
		System.out.println("Provid your \"PHONE NUMBER\"");
		long phone = sc.nextLong();
		for(User u : alu) {
			if(u.getName().equalsIgnoreCase(name) && u.getPhoneNumber()==phone) {
				for (int i = 0; i < alb.size(); i++) {
					if (alb.get(i).getTitle().equalsIgnoreCase(title) && alb.get(i).getAuthor().equalsIgnoreCase(author)) {
						if (alb.get(i).getQuantity() < quantity) {
							throw new BookOutOfStockException("The book you are requesting is out of stock 💀");
						} else {
							int qty = alb.get(i).getQuantity();
							u.setBookQuantity(quantity);
							u.setB(alb.get(i));
							qty -= quantity;
							alb.get(i).setQuantity(qty);
							System.out.println("Borrowed successfully.");
							// when quantity is 0 remove the book from the stock completely
							if (alb.get(i).getQuantity() == 0) {
								alb.remove(i);
							}
							return;
						}

					}
				}
			}
		}
		System.out.println("You are not a valid user to borrow the book");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// returning the book back to the library
	public static void returnBook(String title, String author, int quantity) {
		for (int i = 0; i < alb.size(); i++) {
			if (alb.get(i).getTitle().equalsIgnoreCase(title) && alb.get(i).getAuthor().equalsIgnoreCase(author)) {
				int qty = alb.get(i).getQuantity();
				qty += quantity;
				alb.get(i).setQuantity(qty);
				System.out.println("Thank You for returning");
				return;
			}
		}
		// If the user provides any book which does not exist in the library we have to
		// add it
		System.out.println("Provide the price of the Book :");
		double price = sc.nextDouble();
		alb.add(new Book(title, author, price, quantity));
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
