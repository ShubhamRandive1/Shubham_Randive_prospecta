package com.example.Exception;

public class classNotFoundException extends Exception{
	
	classNotFoundException(){
		
	}
	
	classNotFoundException(String msg){
		super("Class Model Not Found");
	}

}
