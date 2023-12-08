//Program to demonstrate on cascaded if...else statement
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age1: ");
		int age1 = s.nextInt();
		System.out.println("Enter your age2: ");
		int age2 = s.nextInt();
		System.out.println("Enter your age3: ");
		int age3 = s.nextInt();
		
		if(age1>age2 && age1>age3)
		{
			System.out.println("\nAge1 is graeter: "+age1);
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("\nAge2 is graeter: "+age2);
		}
		else
		{
			System.out.println("\nAge3 is graeter: "+age3);
		}
		
		s.close();

	}

}
