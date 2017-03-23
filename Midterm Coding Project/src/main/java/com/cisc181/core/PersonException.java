package com.cisc181.core;


public class PersonException extends Exception {

	private Person person;
	
	public PersonException (Person person) {
		
		this.person = person;
		System.out.println("The data entered is not valid");
	
	}
	
	public Person getperson() {
		
		return person;
	}
	
}
