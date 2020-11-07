package com.training.org;
import java.util.*;
public class Customer {
	private String forename;
	private String surname;
	
	private List<PaymentDetails> paymentDetails;
	private List<Bookable> favourites;
	private CustomerType customerType;
	public Customer(String forename, String surname, List<PaymentDetails> paymentDetails, List<Bookable> favourites,
			CustomerType customerType) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.paymentDetails = paymentDetails;
		this.favourites = favourites;
		this.customerType = customerType;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<PaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public List<Bookable> getFavourites() {
		return favourites;
	}
	public void setFavourites(List<Bookable> favourites) {
		this.favourites = favourites;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	@Override
	public String toString() {
		return "Customer [forename=" + forename + ", surname=" + surname + "]";
	}
	
	
}
