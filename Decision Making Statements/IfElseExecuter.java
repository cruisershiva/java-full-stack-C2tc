//Program to demonstrate on to check the person is eligible to donate the blood or not using if-else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age= s.nextInt();
		System.out.println("Enter your weight: ");
		int weight = s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("\nEligible to donate the blood");
		}
		else 
		{
			System.out.println("Not eligible to donate the blood");
		}
		
		s.close();
	}

}
