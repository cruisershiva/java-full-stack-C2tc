//Program to demonstrate on class and objects
package org.tnsif.classandobject;
//Class declaration
public class Employee {
	
	//Default data members
	String empname;
	int empId;
	float salary;
	String department;
	
	//method declaration and definition 
	void display()
	{
		System.out.println("Emp Id: "+empId+"\nEmp Name: "+empname+"\nSalary: "+salary+"\nDepartment: "+department);
	}

}
