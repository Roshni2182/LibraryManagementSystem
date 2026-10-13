package com.model;

//custom unchecked exception

public class UserDoesNotExistException extends RuntimeException{
	//parameterized constructor for passing the reason
	public UserDoesNotExistException(String msg){
		super(msg);
	}
}
