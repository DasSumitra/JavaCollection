package com.compare.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortedByAddress {

	public static void main(String[] args) {
		Employee e1=new Employee(1001,"Sumitra","Bangalore");
		Employee e2=new Employee(1002,"Ayush","Odisha");
		Employee e3=new Employee(1003,"Dipesh","WestBengal");
		Employee e4=new Employee(1004,"Manoj","Bangalore");
		Employee e5=new Employee(1005,"Arpita","Gujurat");
		List<Employee>empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		Collections.sort(empList, new EmployeeAddressSort());
		System.out.println("Employee record sort by Address : "+empList);
	}

}
