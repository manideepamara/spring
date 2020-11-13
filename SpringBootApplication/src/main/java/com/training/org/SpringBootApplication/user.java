package com.training.org.SpringBootApplication;

public class user {

	
	private String name;
	private String pw;
	public user(String name, String po) {
		super();
		this.name = name;
		this.pw= pw;
	}
	public user() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
