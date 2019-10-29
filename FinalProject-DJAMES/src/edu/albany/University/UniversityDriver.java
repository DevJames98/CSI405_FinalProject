package edu.albany.University;

import java.util.*;
import edu.albany.Building.*;
import edu.albany.Courses.*;
import edu.albany.People.*;


public class UniversityDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates instance of University
		University uAlbany = University.getUniversity();
		
		//Prints University information
		System.out.println(uAlbany.toString() + "\n");
		
		//Create Objects
		Professor umang = new Professor("Umang", "Bram", 40, 234234234, 5.5);
		Professor phipps = new Professor("Michael", "Phipps", 45, 211235934, 25.2);
		Professor cusano = new Professor("Carol", "Cusano", 43, 200034230, 13.5);
		
		Advisor todd = new Advisor("Todd", "Schnitzer", 35, 123234345, 35.9);
		Advisor michelle = new Advisor("Michelle", "Mora", 30, 199994348, 38.01);
		
		Student s1 = new Student("Naruto", "Uzumaki", 18, 123, 0.1);
		Student s2 = new Student("Sasuke", "Uchiha", 18, 234, 52.2);
		Student s3 = new Student("Sakura", "Haruno", 18, 345, 45.9);
		Student s4 = new Student("Neji", "Hyuuga", 21, 456, 50.0);
		Student s5 = new Student("Rock", "Lee", 20, 678, 41.7);
		
		Course calc1 = new Course("Calculus 1", umang, Subject.MATH, ClassType.HYBRID, 30);
		Course calc2 = new Course("Calculus 2", umang, Subject.MATH, ClassType.LECTURE, 30);
		Course eng1 = new Course("English 1", phipps, Subject.ENGLISH, ClassType.FULLY_ONLINE, 24);
		Course eng2 = new Course("English 2", phipps, Subject.ENGLISH, ClassType.LECTURE, 24);
		Course sci1 = new Course("Science 1", cusano, Subject.SCIENCE, ClassType.HYBRID, 25);
		Course sci2 = new Course("Science 2", cusano, Subject.SCIENCE, ClassType.HYBRID, 25);
		
		Library mainLibrary = new Library("Main Library", 1989,5);
		LectureBuilding LectureCenter = new LectureBuilding("Lecture Center", 2010, 5);
		HousingComplex AlumniQuad = new HousingComplex("Alumni Quad", 2004,5);
		
		
		//Adds all employees to the University Employee list
		uAlbany.addEmployee(umang);
		uAlbany.addEmployee(phipps);
		uAlbany.addEmployee(cusano);
		uAlbany.addEmployee(todd);
		uAlbany.addEmployee(michelle);
		System.out.println();
		
		//Prints Employee List
		uAlbany.printArray();
		System.out.println();
		
		//Adds Students to courses
		calc1.addStudent(s1);
		calc1.addStudent(s2);
		calc1.addStudent(s3);
		calc2.addStudent(s4);
		calc2.addStudent(s5);
		
		eng1.addStudent(s2);
		eng1.addStudent(s4);
		eng2.addStudent(s1);
		eng2.addStudent(s3);
		eng2.addStudent(s5);
		
		sci1.addStudent(s1);
		sci1.addStudent(s2);
		sci1.addStudent(s5);
		sci2.addStudent(s3);
		sci2.addStudent(s4);
		
		System.out.println();

		//Creates an array list to hold all courses
		ArrayList<Course> allCourses = new ArrayList<>();
		//adds courses to array list
		allCourses.add(calc1);
		allCourses.add(calc2);
		allCourses.add(eng1);
		allCourses.add(eng2);
		allCourses.add(sci1);
		allCourses.add(sci2);
		
		//Iterates through each course printing course information and its enrollment list
		for (Course c: allCourses) {
			
			//Prints course information
			System.out.println(c.toString());
			System.out.println();
			//Prints enrollment list
			c.printArray();
			System.out.println("===============================================");
			
		}
		
		System.out.println();
		
		//Creates an array list to hold all students
		ArrayList<Student> students = new ArrayList<>();
		//adds students to the array list
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		//Iterates through each student printing its information and the courses they're taking
		for(Student s: students) {
			
			//Prints student information
			System.out.println(s.toString());
			System.out.println();
			//Prints the course they're taking
			s.printArray();
			System.out.println("===============================================");
			
			
		}
		
		System.out.println();
		
		//Iterates through the list of employees printing employee information
		//Also performs raiseSalary() method and prints the new salary for each employee
		for(Employee e: uAlbany.getEmployeeList()) {
			
			//Prints employee information
			System.out.println(e.toString());
			//Raises the employee salary
			e.raiseSalary();
			//Prints Raised Salary
			System.out.println("Raised Salary: " + e.getSalaryPerYear());
			System.out.println("===============================================");
			
		}

		
		//Simulates people entering and leaving buildings throughout the day
		umang.goToBuilding(LectureCenter);
		phipps.goToBuilding(LectureCenter);
		cusano.goToBuilding(mainLibrary);
		todd.goToBuilding(mainLibrary);
		michelle.goToBuilding(mainLibrary);
		s1.goToBuilding(LectureCenter);
		s2.goToBuilding(LectureCenter);
		s3.goToBuilding(AlumniQuad);
		s4.goToBuilding(AlumniQuad);
		s5.goToBuilding(AlumniQuad);
		todd.leaveBuilding(mainLibrary);
		s4.leaveBuilding(AlumniQuad);
		s4.goToBuilding(mainLibrary);
		cusano.leaveBuilding(mainLibrary);
		
		System.out.println();

		//Creates an array list to hold all the buildings
		ArrayList<Building> buildings = new ArrayList<>();
		//adds buildings to the array list
		buildings.add(mainLibrary);
		buildings.add(AlumniQuad);
		buildings.add(LectureCenter);
		
		//Iterates through each building printing its information and a list of people who are currently in the building
		for(Building b: buildings) {
			
			//Prints building information
			System.out.println(b.toString());
			System.out.println();
			//Prints List of people currently in the building
			b.printArray();
			System.out.println("===============================================");
			
		}
		

	}

}
