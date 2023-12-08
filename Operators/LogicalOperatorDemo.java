//Program to demonstrate the logical operator 
package org.tnsif.operators;

public class LogicalOperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(31!=7 && 3>=5);             //AND: We need both the conditions true to get the result as true
		System.out.println(31!=7 || 3>=5);             //OR: We need only one condition true to get the result as true
		System.out.println(!(31!=7 || 3>=5));          

	}

}
