package com.map.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(1010);
		s1.setName("Sumitra");
		s1.setAddress("Bangalore");
		Student s2=new Student();
		s2.setSid(1020);
		s2.setName("Ayush");
		s2.setAddress("Odisha");
		Map<Integer,Student>map=new HashMap<>();
		map.put(s1.getSid(), s1);
		map.put(s2.getSid(), s2);
		List<Integer>listKeys=new ArrayList<>(map.keySet());
		List<Student>listValues=new ArrayList<>(map.values());
		System.out.println(listKeys+"  "+listValues);
		
		
	}

}
