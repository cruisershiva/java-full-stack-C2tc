package org.tnsif.interfaceexecutor;
//Driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//We can't instantiate an interface
		//Sony s=new Sony();
		System.out.println("-----------Channel program of Interface-----------\n");
		SonyTV s1 = new SonyTV();
		s1.display();
		s1.show();
		Sony.accept();
		
		System.out.println("\n\n-----------Chandrayaan program of Interface-----------\n");
		ISRO i = new ISRO();
		i.status();
		
		//Multiple inheritance
		System.out.println("\n\n-----------Drinks program of Interface-----------\n");
		Human h = new Human();
		h.showDrink();

	}

}
