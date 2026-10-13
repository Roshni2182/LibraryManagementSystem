package com.model;
// Book class for creating the books
public class Book {
// private properties of the book
private String title;
private String author;
private double price;
private int quantity;
// Constructor in order to initialize all the properties of the book
public Book(String title, String author, double price, int quantity) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
	this.quantity = quantity;
}
// getters and setters methods for accessing the private properties indirectly
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

// in order to print the details of the books 
@Override
public String toString(){
	return "Title : "+this.title+ ",Author:"+this.author+",Price:"+this.price+",Quantity:"+this.quantity;
}


}
