//Driver class
//Program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;

public class LibraryExecutor {

	public static void main(String[] args) {
		//Object creation
		@SuppressWarnings("unused")
		Library l = new Library();
		Library l1 = new Library(5, "Vishal Lichade","java Programming", 250.56);
		System.out.println(l1);

	}

}
