package edu.albany.Building;

//Creates a subclass of Building
public class LectureBuilding extends Building{

	//Default Constructor
	public LectureBuilding() {
		
		super("",0,0);
		
	}
	
	//Create Constructor
	public LectureBuilding(String name, int year, int max) {
		
		super(name, year, max);
		
	}

	//Methods
	//Implementing method from abstract class Building
	public String toString() {
		
		return "Building Name: " + this.getBuildingName() + "\nYear Built: " + this.getYearBuilt() + "\nMaximum Occupancy: " + this.getMaxOccupancy();
		
	}

}
