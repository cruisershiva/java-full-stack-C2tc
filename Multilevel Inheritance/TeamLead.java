package org.tnsif.multilevelinheritance;
//child class1 and parent class(B)
public class TeamLead extends Manager{
	
	//private data members
	private String leadName;
	private String projectName;
	
	//getters and setters
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	//Parameterized constructor
	public TeamLead(String depatName, String name, int empId, String leadName, String projectName) {
		super(depatName, name, empId);
		this.leadName=leadName;
		this.projectName=projectName;
		
	}
	
	//ToString() method
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", getDepatName()=" + getDepatName()
				+ ", getName()=" + getName() + ", getEmpId()=" + getEmpId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
