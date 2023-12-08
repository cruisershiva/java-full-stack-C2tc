//Driver class
//Program to demonstrate on class and objects
package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		//Object Creation
		Employee e = new Employee();
		e.empId = 12345;
		e.empname = "Sakshi Rahane";
		e.salary=80000;
		e.department = "IT";
		
		//Method Call
		e.display();

	}

}
