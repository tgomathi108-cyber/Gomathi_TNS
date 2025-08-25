package com.yourname.assignment.employees;

public class Employee {
	private String name;
	private int empid ;
	private double salary;

	public Employee(String name,int empid,double salary)
	{
	this.name=name;
	this.empid=empid;
	this.salary=salary;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return empid;
	}

	public void setAge(int age) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary =salary;
	}
	

}
