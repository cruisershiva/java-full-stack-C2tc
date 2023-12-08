//Program to demonstrate ternary operator
package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num: ");
		int num=s.nextInt();
		
		//Ternary operator
		String Result = (num%2==0)?"Even": "Odd";
		System.out.println("Result is: "+Result);
		s.close();
		
	}

}
