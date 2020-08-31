package com.nt.compare;

public class Employee implements Comparable<Employee>{
	private int eId;
	private String name;
	private String address;

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

	

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.eId-e.eId;
	}

}
