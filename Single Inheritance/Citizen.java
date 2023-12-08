package org.tnsif.singleinheritance;
//base class
public class Citizen {

	//Private data members
		private String city;
		private int pincode;
		private String area;
		private long adharNo;
		
	//getter and setter
	public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public long getAdharNo() {
			return adharNo;
		}
		public void setAdharNo(long adharNo) {
			this.adharNo = adharNo;
		}

	@Override
	public String toString() {
		return "Citizen [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	//Default constructor
	public Citizen() {
		System.out.println("Citizen-Parent class");	
	}

	//Parameterized constructor
	public Citizen(String city, int pincode, String area, long adharNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharNo = adharNo;
	}

	
	
}
