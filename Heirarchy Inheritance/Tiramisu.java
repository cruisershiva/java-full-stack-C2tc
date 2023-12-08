package org.tnsif.hierachicalinheritance;
//child class1
public class Tiramisu extends Android{
	//private members
	private int version;
	
	
	//getter and setter
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	//parameterized constructor
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;	
	}
	
	//ToString() method
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
