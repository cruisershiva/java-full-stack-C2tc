//Program to demonstrate on bunjee jumping using nested if
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s.nextInt();
		System.out.println("Enter your weight: ");
		int weight = s.nextInt();		
		
		if(age>=12)
		{
			System.out.println("\nEligible for bunjee jumping");
			if(weight>=40)
			{
				if(weight>110)
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not eligible for bunjee jumping");
		}
		
		s.close();
	}

}
