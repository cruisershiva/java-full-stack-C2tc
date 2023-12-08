//Program to demonstrate Switch case
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the song no: ");
		int songno = s.nextInt();
		switch(songno)
		{
			case 1:
				System.out.println("Waka Waka");
				break;
				
			case 2:
				System.out.println("Taki Taki");
				break;
			 
			case 3:
				System.out.println("Jai Shree Ram");
				break;
				
			default:
				System.out.println("Invalid Input");
			 
		}
		s.close();
	}

}
