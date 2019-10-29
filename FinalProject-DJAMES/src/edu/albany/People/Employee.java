package edu.albany.People;

//Creates subclass to Person that implements Salary interface
public class Employee extends Person implements Salary{

	//Used to store the employeeID
	private int employeeID;
	//Used to store the amount of hours the employee works per week
	private double hoursPerWeek;
	//Used to store the employees' yearly salary(To be Calculated)
	protected double salaryPerYear;
	//Stores the rate an employee makes
	private final double baseRate = 12.0;
	
	//Default Constructor
	public Employee() {
		
		super("","",0);
		this.employeeID = 300000000;
		this.hoursPerWeek = 0;
		this.salaryPerYear = 0.0;
		
		
	}
	
	//Create Constructor
	public Employee(String fName, String lName, int age, int eID, double hours) {
		
		super(fName, lName, age);
		this.employeeID = eID;
		this.hoursPerWeek = hours;
		this.salaryPerYear = this.calculateSalary();
		
	}
	
	
	//Getters and Setters
	
	public int getEmployeeID() {
		
		return employeeID;
		
	}
	
	public void setEmployeeID(int newID) {
		
		employeeID = newID;
		
	}
	
	public double getHoursPerWeek() {
		
		return hoursPerWeek;
		
	}
	
	public void setHoursPerWeek(double newHours) {
		
		hoursPerWeek = newHours;
		
	}
	
	public double getSalaryPerYear() {
		
		return salaryPerYear;
		
	}
	
	public void setSalaryPerYear(double newSalary) {
		
		salaryPerYear = newSalary;
		
	}
	
	
	//Methods
	//Used to calculate the salary and stores in variable (see Constructor)
	public double calculateSalary() {
		
		//Multiplies the base rate by the amount of hours they work per week
		//Couldn't get an actual salary calculation to work correctly
		return baseRate * this.getHoursPerWeek();
		
	}
	
	//Used to raise the salary of an employee
	public void raiseSalary() {
		
		double oldSalary = this.getSalaryPerYear();
		double raiseAmount = oldSalary * 0.05;
		
		//Sets the newly calculated salary to the Employee object
		this.setSalaryPerYear(oldSalary + raiseAmount);
		
	}
	
	//Overrides implemented method from parent class (Person)
	@Override
	public String toString() {
		
		
		return "Employee Name: " + this.getFirstName() + " " + this.getLastName() + "\nAge: " + this.getAge() + "\nEmployeeID: " + this.getEmployeeID() + "\nYearly Salary: " + this.getSalaryPerYear();

		
	}

	
}
