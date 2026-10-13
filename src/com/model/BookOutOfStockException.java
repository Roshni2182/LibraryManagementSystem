package com.model;

//custom unchecked exception
	public class BookOutOfStockException extends RuntimeException{
		// parameterized constructor for passing the reason
		public BookOutOfStockException(String msg){
			super(msg);
		}
	}

