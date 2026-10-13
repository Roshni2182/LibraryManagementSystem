package com.model;

//user class for creating user objects
public class User {
	// private properties of the user
	private int userId;
	private String name;
	private long phoneNumber;
	private Book b;
	private int bookQuantity;

	// parameterized constructor for the dynamic initialization of the user
	// properties
	public User(String name, long phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.userId = this.hashCode();
	}

	// getters and setters for updating and fetching the user details
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	// to generate the unique integer value for user ID.
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int) (super.hashCode() + this.phoneNumber + this.name.hashCode());
	}

	// in order to print the details of the user object
	@Override
	public String toString() {
		if (b != null) {
			this.b.setQuantity(bookQuantity);
		}
		return "User ID : " + this.userId + ", Name : " + this.name + ", Phone : " + this.phoneNumber
				+ ", Book burrowed : " + this.b;
	}
}
