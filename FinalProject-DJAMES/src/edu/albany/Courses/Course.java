package edu.albany.Courses;

import java.util.*;
import edu.albany.University.*;
import edu.albany.People.*;

//Creates class that implements the generic interface
public class Course implements PrintArray<Course>{

	//Used to store the name of the course
	private String courseName;
	//Used to store the professor associated with the course
	private Professor professor;
	//Used to store the subject of the course
	private Subject courseSubject;
	//Used to store the class type of the course
	private ClassType classType;
	//Used to store the max number of students that can be enrolled in the class
	private int maxStudents;
	//Creates an array list of Students to store the students enrolled in the course
	private ArrayList<Student> studentsEnrolled;
	
	//Create Constructor
	public Course(String name, Professor p, Subject s, ClassType c, int max) {
		
		this.courseName = name;
		this.professor = p;
		this.courseSubject = s;
		this.classType = c;
		this.maxStudents = max;
		//Initializes the array list with the size of the maxStudents
		this.studentsEnrolled = new ArrayList<>(maxStudents);
		
		
	}
	
	//Getters and Setters
	public String getCourseName() {
		
		return courseName;
		
	}
	
	public void setCourseName(String newName) {
		
		courseName = newName;
		
	}
	
	public Professor getProfessor() {
		
		return professor;
		
	}
	
	public void setProfessor(Professor newProfessor) {
		
		professor = newProfessor;
		
	}
	
	public Subject getSubject() {
		
		return courseSubject;
		
	}
	
	public void setSubject(Subject newSubject) {
		
		courseSubject = newSubject;
		
	}
	
	public ClassType getClassType() {
		
		return classType;
		
	}
	
	public void setClassType(ClassType newType) {
		
		classType = newType;
		
	}
	
	public int getMaxStudents() {
		
		return maxStudents;
		
	}
	
	public void setMaxStudents(int newMax) {
		
		maxStudents = newMax;
		
	}
	
	public ArrayList<Student> getStudentsEnrolled(){
		
		return studentsEnrolled;
		
	}
	
	
	//Methods
	public String toString() {
		
		return "Course Name: " + this.getCourseName() + "\nProfessor: " + this.professor.getFirstName() + " " + this.professor.getLastName() + "\nSubject: " + this.getSubject() + "\nClass Type: " + this.getClassType() + "\nMaximum Occupancy: " + this.getMaxStudents();
		
	}
	
	//Adds new Student to ArrayList (enrollment list)
	public void addStudent(Student s) {
		
		try{
			
			//Checks to see if the class is full
			if(studentsEnrolled.size() <= maxStudents) {
				
				//Adds student to the course's enrollmentList
				studentsEnrolled.add(s);
				//Adds course to the student's currentCourses list
				s.addCourse(this);
				//Confirmation
				System.out.println("Student Added");
				
			}
			
			
		}
		catch(Exception e){
			
			//Display error message
			System.out.println("ERROR! " + this.getCourseName() + "'s maximum occupancy has been reached!\n" + e);
			
		}
		
	}
	
	//Deletes student from ArrayList
	public void deleteStudent(Student s) {
		
		//Gets the index of the student we want to delete
		int studentIndex = studentsEnrolled.indexOf(s);
		//Deletes what's at that index
		studentsEnrolled.remove(studentIndex);
		//Deletes from student course list
		s.deleteCourse(this);
		//Confirmation
		System.out.println("Student Deleted");
		
	}
	
	//Implementing method from PrintArray interface
	//Prints all Students' information who is enrolled in the course
	@Override
	public void printArray() {
		
		System.out.println("Enrollment List for " + this.getCourseName() + ": ");
		
		for(Student s : studentsEnrolled) {
			
			//not using toString() method here since age, etc. is not required for an enrollment list
			System.out.println(s.getFirstName() + " " + s.getLastName());
			
		}
		
	}
	
	
}
