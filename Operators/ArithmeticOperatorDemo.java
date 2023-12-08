//Program to demonstrate arithmetic operator
package org.tnsif.operators;

import java.util.Scanner;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the values of num1 and num2: ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("Addition: "+num1+num2);
		System.out.println("Substraction: "+(num1-num2));
		System.out.println("Multiplication: "+num1*num2);
		System.out.println("Division: "+num1/num2);
		System.out.println("Modulus: "+num1%num2);
		s.close();
	}

}
