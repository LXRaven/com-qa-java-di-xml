package com.qa.spring.di.xml.beans;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String contactNo;
	private List<Order> ordersList;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public List<Order> getOrdersList() {
		return ordersList;
	}
	public void setOrdersList(List<Order> ordersList) {
		this.ordersList = ordersList;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", contanctNo=" + contactNo
				+ ", ordersList=" + ordersList + "]";
	}
	public void init() {
		System.out.println("Initializing Customer");
	}
	
	public void destroy() {
		System.out.println("Destroying Customer");
	}
	
}
