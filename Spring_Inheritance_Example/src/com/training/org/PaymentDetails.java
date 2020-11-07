package com.training.org;

public class PaymentDetails {

	
	private String id;
	private String name;
	public PaymentDetails(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "paymentDetails [id=" + id + ", name=" + name + "]";
	}
}
