package edu.albany.University;

import java.util.*;
import edu.albany.People.*;

public class University implements PrintArray<University>{

	//Used for Singleton implementation
	private static University university = null;
	
	
	//Used to hold the name of the University
	private String universityName;
	//Used to hold the year the University was founded
	private int yearFounded;
	//Used to hold the max # of students in the University 
	private int maxStudents;
	//Used to hold the address of the University
	private String universityAddress;
	
	//Creates an array list to hold a list of Employees that work at the University
	//Since it is a singleton, only need one array list. No need to initialize in constructor
	private ArrayList<Employee> employeeList = new ArrayList<>();
	
	//Default constructor
	private University() {
		
		this.universityName = "University at Albany, SUNY";
		this.yearFounded = 1844;
		this.maxStudents = 17944;
		this.universityAddress = "1400 Washington Ave.\nAlbany, NY 12222";
		
	}
	
	/* Is this needed if Singleton? NO
	public University(String name, int year, int max, String address) {
		
		this.universityName = name;
		this.yearFounded = year;
		this.maxStudents = max;
		this.universityAddress = address;
		
	}
	*/
	
	
	//Singleton implementation
	public static University getUniversity() {
		
		if(university == null) {
			
			//Creates a new instance of University
			university = new University();
			
		}
		
		return university;
		
	}
	
	
	//Getters and Setters
	
	public String getUniversityName() {
		
		return universityName;
		
	}
	
	public void setUniversityName(String newName) {
		
		universityName = newName;
		
	}
	
	public int getYearFounded() {
		
		return yearFounded;
		
	}
	
	public void setYearFounded(int newYear) {
		
		yearFounded = newYear;
		
	}
	
	public int getMaxStudents() {
		
		return maxStudents;
		
	}
	
	public void setMaxStudents(int newMax) {
		
		maxStudents = newMax;
		
	}
	
	public String getUniversityAddress() {
		
		return universityAddress;
		
	}
	
	public void setUniversityAddress(String newAddress) {
		
		universityAddress = newAddress;
		
	}
	
	public ArrayList<Employee> getEmployeeList(){
		
		return employeeList;
		
	}
	
	//Methods
	public String toString() {
		
		return "Name of University: "+ this.getUniversityName() + "\nFounding Year: " + this.getYearFounded() + "\nMaximum Number of Students: " + this.getMaxStudents() + "\nAddress: " + this.getUniversityAddress();
		
	}
	
	//Adds new Employee to ArrayList
	public void addEmployee(Employee e) {
			
		employeeList.add(e);
		System.out.println("Employee Added");
			
	}
	
	//Deletes employee from ArrayList
	public void deleteEmployee(Employee e) {
		
		//Gets the index of the employee we want to delete
		int employeeIndex = employeeList.indexOf(e);
		//Removes what's in that index
		employeeList.remove(employeeIndex);
		//Confirmation
		System.out.println("Employee Deleted");
			
	}
		
	//Prints all Employees' information who works in the University
	@Override
	public void printArray() {
			
		System.out.println("Employee List for " + this.getUniversityName() + ": ");
			
		for(Employee e : employeeList) {
				
			//not using toString() method here since certain variables are not required for an employee list
			System.out.println("Name: " + e.getFirstName() + " " + e.getLastName() + "          Employee ID: " + e.getEmployeeID());
				
		}
			
	}
			
	
}
