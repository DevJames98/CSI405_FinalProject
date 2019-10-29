package edu.albany.People;

//Creates subclass to Employee that implements the Salary interface
public class Advisor extends Employee implements Salary{

	//Used to store the rate for advisors
	private final double advisorRate = 15.2;
	//Used to store the percentage advisors are raised by
	private final double raisePercentage = 0.75;
	
	//Default Constructor
	public Advisor() {
		
		super("","",0,0,0.0);
		
		
	}
	
	//Create Constructor
	public Advisor(String fName, String lName, int age, int eID, double hours) {
		
		super(fName, lName, age, eID, hours);
		this.salaryPerYear = this.calculateSalary();
		
	}
	

	//Getters and Setters not needed since no new instance variables

	
	//Methods
	//Implementing method from Salary interface
	@Override
	public double calculateSalary() {
		
		return advisorRate * this.getHoursPerWeek();
		
	}
	
	//Implementing method from Salary interface
	@Override
	public void raiseSalary() {
		
		double oldSalary = this.getSalaryPerYear();
		double raiseAmount = oldSalary * raisePercentage;
		
		//Sets the newly calculated salary to the Employee object
		this.setSalaryPerYear(oldSalary + raiseAmount);
		
	}
	
	//Overriding toString method from parent class (Employee)
	@Override
	public String toString() {
		
		
		return "Advisor Name: " + this.getFirstName() + " " + this.getLastName() + "\nAge: " + this.getAge() + "\nEmployeeID: " + this.getEmployeeID() + "\nYearly Salary: " + this.getSalaryPerYear();

		
	}
	

}
