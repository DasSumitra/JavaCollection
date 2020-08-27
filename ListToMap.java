package com.map.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

	public static void main(String[] args) {
		List<Student>stList=new ArrayList<>();
		Student st1=new Student();
		st1.setSid(1010);
		st1.setName("Sumitra");
		st1.setAddress("Bangalore");
		Student st2=new Student();
		st2.setSid(1020);
		st2.setName("Ayush");
		st2.setAddress("Odisha");
		Student st3=new Student();
		st3.setSid(1030);
		st3.setName("Ankit");
		st3.setAddress("UP");
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		System.out.println("Student list are : "+stList);
		Map<Integer,Student>stMap=new HashMap<>();
		for(Student s:stList) {
			stMap.put(s.getSid(), s);
		}
		System.out.println("Student Map : "+stMap);
		
	}
	

}
