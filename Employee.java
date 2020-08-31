package com.compare.test;

public class Employee{
	private int eId;
	private String name;
	private String address;
	
	public Employee(int eId, String name, String address) {
		this.eId = eId;
		this.name = name;
		this.address = address;
	}


	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", address=" + address + "]";
	}
	

}
