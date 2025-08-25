package com.yourname.assignment.utilities;
import com.yourname.assignment.employees.Employee;


public class EmployeeUtilities {
	public void print(Employee e) {
		System.out.println("Employee name is "+e.getName());
				
				System.out.println("Employee Age is "+e.getid());		

				System.out.println("Employee salary is "+e.getSalary());	
			}
			public void increasesalary(Employee e,double percentage) {

				double newsalary=e.getSalary()+(e.getSalary()*percentage/100);
				e.setSalary(newsalary);
				System.out.println("updated salary="+e.getSalary());
				
			}
		}


