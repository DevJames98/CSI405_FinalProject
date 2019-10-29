package edu.albany.People;

import edu.albany.Building.*;


public class Person {

	//Used to hold the person's first name
	private String firstName;
	//Used to hold the person's last name
	private String lastName;
	//Used to hold the person's age
	private int age;
	
	
	//Default Constructor
	public Person() {
		
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		
	}
	
	//Create Constructor
	public Person(String fName, String lName, int age) {
		
		this.firstName = fName;
		this.lastName = lName;
		
		//Encapsulation
		//Makes sure that the age is always a positive value
			
		if(age >= 0) {
				
			this.age = age;
				
		}
		else {
				
			throw new ArithmeticException("ERROR. Age must be positive."); 
				
		}
						
		
	}
	
	//Getters and Setters
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public void setFirstName(String newFName) {
		
		firstName = newFName;
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	
	public void setLastName(String newLName) {
		
		lastName = newLName;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public void setAge(int newAge) {
		
		//Makes sure that the set age is positive
		if(newAge >= 0) {
			
			age = newAge;
				
		}
		else {
				
			throw new ArithmeticException("ERROR. Age must be positive."); 
				
		}
		
	}
	
	
	//Methods
	
	public String toString() {
		
		return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nAge: " + this.getAge();		
	}
	
	
	//Makes function to represent going into a building - adds person to that building's arrayList
	public void goToBuilding(Building b) {
		
		b.addPerson(this);
		
	}
	
	//Makes function to represent leaving a building - deletes person from that building's arrayList
	public void leaveBuilding(Building b) {
		
		b.deletePerson(this);
		
	}
	
	
	
}
