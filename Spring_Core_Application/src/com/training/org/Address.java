package com.training.org;

public class Address {
	
	String houseNo;
	String laneNo;
	String city;
	String state;

	public Address(String houseNo, String laneNo, String city, String state) {
		
		this.houseNo = houseNo;
		this.laneNo = laneNo;
		this.city = city;
		this.state = state;
	}

	public String getHouseNo() {
		return houseNo;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", laneNo=" + laneNo + ", city=" + city + ", state=" + state + "]";
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
