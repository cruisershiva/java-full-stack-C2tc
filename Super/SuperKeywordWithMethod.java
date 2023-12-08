package org.tnsif.superkeyword;

class MET
{
	String ownerName="Chagan Bhujbal";
	void displayName()
	{
		System.out.println("owner is:"+ownerName);
	}
}
class BKC extends MET
{
	String ownerName="Sheffali Bhujbal";
	
	void displayName()
	{
		/*if parent class and child class method name are same ,and if you want to access that method 
		 *inside child class then use super.methodName  */
		super.displayName();
		System.out.println("owner is:"+ownerName);
	}
}

//Driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b=new BKC();
	    b.displayName();

	}

}
