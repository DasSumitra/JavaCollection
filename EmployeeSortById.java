package com.nt.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSortById {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.seteId(1010);
		emp1.setName("Manoj");
		emp1.setAddress("Bangalore");
		Employee emp2=new Employee();
		emp2.seteId(1030);
		emp2.setName("Ayush");
		emp2.setAddress("Odisha");
		Employee emp3=new Employee();
		emp3.seteId(1020);
		emp3.setName("Vinay");
		emp3.setAddress("Hyd");
		List<Employee>empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		System.out.println("Employee Lists Are : "+empList);
		Set<Employee>empSet=new TreeSet<>(empList);
		System.out.println("Soterd Employee by Eid "+empSet);
		Collections.sort(empList);
		System.out.println("Sorted Employee date based on Eid : "+empList);
		
	}

}
