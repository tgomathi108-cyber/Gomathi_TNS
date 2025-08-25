package com.yourname.assignment.employees;
import com.yourname.assignment.employees.Employee;

public class Manager extends Employee {
	private String dept;
	public Manager(String name,int empid,double salary,String dept) {
		super(name,empid,salary);
		this.dept=dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}

