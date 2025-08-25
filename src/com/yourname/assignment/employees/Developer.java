package com.yourname.assignment.employees;
import com.yourname.assignment.employees.Employee;
public class Developer extends Employee {
	public String programminglang;

	public Developer(String name,int empid,double salary,String programminglang) {
		super(name,empid,salary);
		this.programminglang=programminglang;
	}

	public String getProgramminglang() {
		return programminglang;
	}

	public void setProgramminglang(String programminglang) {
		this.programminglang = programminglang;
	}
	
	
}

	