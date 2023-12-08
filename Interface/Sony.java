package org.tnsif.interfaceexecutor;
//Program to demonstrate on an Interface
public interface Sony {
	
	/*By default all the variables inside the interface is public static final*/
	int noOfChannels=8;         
	
	//By default all the method an interface is an abstract method 
	void display();
	
	/*Core java 8 provides a static and default method inside an interface*/
	
	//Static method
	static void accept()
	{
		System.out.println("Static method");
	}
	
	//Default method
	default void show()
	{
		System.out.println("Default method");
	}
	

}
