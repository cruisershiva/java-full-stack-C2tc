package org.tnsif.multilevelinheritance;

public class TeamMember extends TeamLead{

	private int size;
	private int duration;
	
	//getter and setter
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//Parameterized constructor
	public TeamMember(String depatName, String name, int empId, String leadName, String projectName, int size, int duration) {
		super(depatName, name, empId, leadName, projectName);
		this.size=size;
		this.duration=duration;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
