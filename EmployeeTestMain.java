package com.test.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeTestMain {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		Employee e1=new Employee();
		e1.setEmpId(2020);
		e1.setName("Manoj");
		e1.setAddress("Bangalore");
		Employee e2=new Employee();
		e2.setEmpId(2021);
		e2.setName("Sumitra");
		e2.setAddress("Odisha");
		Employee e3=new Employee();
		e3.setEmpId(2022);
		e3.setName("Manoj");
		e3.setAddress("Bangalore");
		Employee e4=new Employee();
		e4.setEmpId(2023);
		e4.setName("Sumitra");
		e4.setAddress("Odisha");
		Employee e5=new Employee();
		e5.setEmpId(2024);
		e5.setName("Mohit");
		e5.setAddress("Bangalore");
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		System.out.println("Employee lists Are  "+emps);
		System.out.println(emps.size());
		Set<Employee>setEmps=new HashSet<>(emps);
		System.out.println(".."+setEmps);
		System.out.println(setEmps.size());
		
	}

}
