package edu.albany.Building;

//Creates a subclass of Building
public class Library extends Building{

	//Default Constructor
	public Library() {
		
		super("",0,0);
		
	}
	
	//Create Constructor
	public Library(String name, int year, int max) {
		
		super(name, year, max);
		
	}
	
	
	
	//Methods
	//Implementing method from abstract class Building
	public String toString() {
		
		return "Library Name: " + this.getBuildingName() + "\nYear Built: " + this.getYearBuilt() + "\nMaximum Occupancy: " + this.getMaxOccupancy();
		
	}
	
	
}
