package com.training.org;

public class EmployeeDTO {

	private int id;
	private String firstName;
	private String latsName;
	private String designation;
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(int id, String firstName, String latsName, String designation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.latsName = latsName;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLatsName() {
		return latsName;
	}
	public void setLatsName(String latsName) {
		this.latsName = latsName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", firstName=" + firstName + ", latsName=" + latsName + ", designation="
				+ designation + "]";
	}
	
}
