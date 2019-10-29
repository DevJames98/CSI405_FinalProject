package edu.albany.Building;

//Creates a subclass of Building
public class HousingComplex extends Building{

	//Default Constructor
	public HousingComplex() {
		
		super("",0,0);
		
	}
	
	//Create Constructor
	public HousingComplex(String name, int year, int max) {
		
		super(name, year, max);
		
	}
	

	//Methods
	//Implementing method from abstract class Building
	public String toString() {
		
		return "Complex Name: " + this.getBuildingName() + "\nYear Built: " + this.getYearBuilt() + "\nMaximum Occupancy: " + this.getMaxOccupancy();
		
	}
	
	
}
