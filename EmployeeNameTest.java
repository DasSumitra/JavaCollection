package com.list.employee.name;

import java.util.ArrayList;
import java.util.List;

import com.list.employee.Employee;

public class EmployeeNameTest {

	public static void main(String[] args) {
List<Employee>emplist=new ArrayList<>();
		
		Employee e1=new Employee(1001,"Manoj","Bangalore");
		Employee e2=new Employee(1002,"Ankit","WestBengal");
		Employee e3=new Employee(1003,"Ayush","Odisha");
		Employee e4=new Employee(1004,"Mahesh","Bangalore");
		Employee e5=new Employee(1005,"Mohit","Bangalore");
		Employee e6=new Employee(1006,"Kirtika","Delhi");
		Employee e7=new Employee(1007,"Rudra","Mumbai");
		Employee e8=new Employee(1008,"Soumya","Chenai");
		Employee e9=new Employee(1009,"Megha","Pune");
		Employee e10=new Employee(1010,"Jayshree","Bangalore");
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		emplist.add(e7);
		emplist.add(e8);
		emplist.add(e8);
		emplist.add(e10);
		System.out.println("Employee Lists Are   ..."+emplist);
		List<String>empNameList=new ArrayList<>();
		for(Employee e:emplist) {
			empNameList.add(e.getName());
		}
		System.out.println("All Employee Name Lists Are  : "+empNameList);
	}

}
