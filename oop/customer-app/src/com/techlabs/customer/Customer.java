package com.techlabs.customer;

public class Customer {
	private String fname;
	private String lname;
	private static int nextId = 1000;
	private int id;

	public Customer(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		nextId++;
		setId(nextId);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getId() {
		return id;
	}
}
