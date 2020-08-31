package com.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortByName {

	public static void main(String[] args) {
		Employee e1=new Employee(2020,"Ankit","UP");
		Employee e2=new Employee(2030,"Shreya","Mumbai");
		Employee e3=new Employee(2040,"Bishal","Bangalore");
		Employee e4=new Employee(2020,"Ayush","Odisha");
		Employee e5=new Employee(2020,"Piyush","MP");
		List<Employee>employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		Collections.sort(employees, new EmployeeNameSort());
		System.out.println("Employee record sorted by name : "+employees);
		
	}

}
