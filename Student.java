package com.comparator.test;

import java.util.Comparator;

public class Student {
	private int sId;
	private String sname;
	private String address;

	public Student(int sId, String sname, String address) {
		this.sId = sId;
		this.sname = sname;
		this.address = address;
	}

	public int getsId() {
		return sId;
	}

	public String getSname() {
		return sname;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sname=" + sname + ", address=" + address + "]";
	}
	


}
