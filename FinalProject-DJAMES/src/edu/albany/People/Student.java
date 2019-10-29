package edu.albany.People;

import java.util.*;
import edu.albany.University.*;
import edu.albany.Courses.*;

//Creates subclass to Person that implements PrintArray interface
public class Student extends Person implements PrintArray<Student>{

	//Used to hold the studentID
	private int studentID;
	//Used to hold the number of credits the student has taken
	private double creditsTaken;
	//Makes sure a student cannot take more than 6 courses (not really neccessary)
	private final int maxCoursesPerSemester = 6;
	//Makes an array list to hold the courses the Student is currently taking
	private ArrayList<Course> currentCourses;
	
	
	//Default Constructor
	public Student() {
		
		super("","",0);
		this.studentID = 100000000;
		this.creditsTaken = 0.0;
		//Initialize a new array (Course) list for each Student
		this.currentCourses = new ArrayList<>();
		
	}
	
	//Create Constructor
	public Student(String fName, String lName, int age, int sID, double credits) {
		
		super(fName,lName,age);
		this.studentID = sID;
		this.creditsTaken = credits;
		//Initialize a new array (Course) list for each Student
		this.currentCourses = new ArrayList<>();
		
	}
	
	//Getters and Setters
	public int getStudentID() {
		
		return studentID;
		
	}
	
	public void setStudentID(int newID) {
		
		studentID = newID;
		
	}
	
	public double getCreditsTaken() {
		
		return creditsTaken;
		
	}
	
	public void setCreditsTaken(double newCreds) {
		
		creditsTaken = newCreds;
		
	}
	
	public ArrayList<Course> getCurrentCourses(){
		
		return currentCourses;
		
	}
	
	//Methods
	@Override
	public String toString() {
		
		return "Student Name: " + this.getFirstName() + " " + this.getLastName() + "\nAge: " + this.getAge() + "\nStudentID: " + this.getStudentID() + "\nCredits Taken: " + this.getCreditsTaken();
		
	}
	
	//Adds a course to the students' course list
	public void addCourse(Course c) {
		
		try{
			
			//Checks to make sure the student is not taking more than 6 courses
			if(currentCourses.size() <= maxCoursesPerSemester) {
				
				//Adds course to array list
				currentCourses.add(c);
				//Confirmation
				System.out.println("Course Added to Student");
				
			}
			
			
		}
		//Throws exception if Student is trying to add more than maxCoursesPerSemester
		catch(Exception e){
			
			//Display error message
			System.out.println("ERROR! " + this.getFirstName() + "'s maximum number of courses has been reached!\n" + e);
			
		}
		
	}
	
	//Deletes a course from the students' course list
	public void deleteCourse(Course c) {
		
		//Gets the index of the course we want to delete
		int courseIndex = currentCourses.indexOf(c);
		//Removes what's at that index
		currentCourses.remove(courseIndex);
		//Confirmation
		System.out.println("Course Deleted");
		
	}
	
	//Implement method from interface
	@Override
	public void printArray() {
		
		//Label
		System.out.println("Course List for " + this.getFirstName() + " " + this.getLastName() + ": ");
		//Iterates through each course printing the course name and the professor name
		for(Course c : currentCourses) {
			
			//not using toString() method here since not all course information is needed
			System.out.println(c.getCourseName() + "     Professor: " + c.getProfessor().getFirstName() + " " + c.getProfessor().getLastName() );
			
		}
		
	}
	
	
}
