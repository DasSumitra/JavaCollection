package com.array.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[]empArray=new Employee[3];
		empArray[0]=new Employee(1001, "Manoj", "Bangalore");
		empArray[1]=new Employee(1002, "Sumitra", "Hyd");
		empArray[2]=new Employee(1003, "Ayush", "Odisha");
		for(int i=0;i<empArray.length;i++) {
			System.out.println("Employee details : "+empArray[i]);
		}
		List<Employee>empList=new ArrayList<>(empArray.length);
		for(int i=0;i<empArray.length;i++) {
			empList.add(empArray[i]);
		}
		System.out.println("Print list of employee details :"+empList);
		List<Employee>empList2=Arrays.asList(empArray);
		System.out.println("Second employee list :"+empList2);
		
	}

}
