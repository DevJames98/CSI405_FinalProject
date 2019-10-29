package edu.albany.Building;

import java.util.*;
import edu.albany.University.*;
import edu.albany.People.*;

//Creates abstract class that implements the PrintArray interface
public abstract class Building implements PrintArray<Building>{

	//Used to store the name of the building
	private String buildingName;
	//Used to store the year building was built
	private int yearBuilt;
	//Used to store the maxOccupancy of the building
	private int maxOccupancy;
	//Creates arraylist to hold the people that are currently in the building
	private ArrayList<Person> peopleInBuilding;
	
	//Default Constructor
	public Building() {
		
		this.buildingName = "";
		this.yearBuilt = 2019;
		this.maxOccupancy = 1;
		this.peopleInBuilding = new ArrayList<>(maxOccupancy);
		
	}
	
	//Create Constructor
	public Building(String name, int year, int max) {
		
		this.buildingName = name;
		this.yearBuilt = year;
		
		//Checks to see if the max is a positive number
		if(max >= 0) {
			
			this.maxOccupancy = max;
			
		}
		else {
			
			//Sets occupancy if a negative number is entered
			this.maxOccupancy = 1;
			
		}
		
		//Creates a new array list with the size of maxOccupancy
		this.peopleInBuilding = new ArrayList<>(maxOccupancy);
		
	}
	
	
	//Getters and Setters
	public String getBuildingName() {
		
		return buildingName;
		
	}
	
	public void setBuildingName(String newName) {
		
		buildingName = newName;
		
	}
	
	public int getYearBuilt() {
		
		return yearBuilt;
		
	}
	
	public void setYearBuilt(int newYear) {
		
		yearBuilt = newYear;
		
	}
	
	public int getMaxOccupancy() {
		
		return maxOccupancy;
		
	}
	
	public void setMaxOccupancy(int newMax) {
		
		maxOccupancy = newMax;
	}
	
	public ArrayList<Person> getPeopleInBuilding(){
		
		return peopleInBuilding;
		
	}
	
	
	//Methods
	//Method to be implemented by each Building (subclass)
	public abstract String toString();
	
	//Adds new Person to ArrayList
	public void addPerson(Person p) {
		
		
		try{
			
			//Checks if the building is at maxOccupancy
			if(peopleInBuilding.size() <= maxOccupancy) {
				
				//Adds person to the list of people in the building
				peopleInBuilding.add(p);
				//Confirmation
				System.out.println("Person Added");
				
			}
			
			
		}
		catch(Exception e){
			
			//Display error message
			System.out.println("ERROR! " + this.getBuildingName() + "'s maximum occupancy has been reached!\n" + e);
			
		}
			
	}
		
	//Deletes person from ArrayList
	public void deletePerson(Person p) {
		
		//Gets the index of the person we want to remove
		int personIndex = peopleInBuilding.indexOf(p);
		//Deletes what's at that index
		peopleInBuilding.remove(personIndex);
		//Confirmation
		System.out.println("Person Deleted");
			
	}
		
	//Prints all the people who are currently in the building
	@Override
	public void printArray() {
			
		System.out.println("List of People Currently in " + this.getBuildingName() + ": ");
			
		for(Person p : peopleInBuilding) {
				
			//not using toString() method here since we only want their names
			System.out.println(p.getFirstName() + " " + p.getLastName());
				
			}
			
		}

	
}
