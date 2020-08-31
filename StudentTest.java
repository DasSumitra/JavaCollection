package com.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student(1004,"Sumitra","Bangalore");
		Student s2=new Student(1005,"Manoj","MP");
		Student s3=new Student(1001,"Ayush","Odisha");
		Student s4=new Student(1003,"Mohit","UP");
		Student s5=new Student(1002,"Kirtika","Bhubaneswar");
		List<Student>stdList=new ArrayList<>();
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		stdList.add(s5);
		System.out.println("Print the Student records : "+stdList);
		
		Collections.sort(stdList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getsId()-s2.getsId();
            }
        });
		
		System.out.println("Student records sorted by Id : "+ stdList);
		
		Collections.sort(stdList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getSname().compareTo(s2.getSname());
			}
			
		});
		System.out.println("Student records sorted by name : "+ stdList);
		
		Collections.sort(stdList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAddress().compareTo(s2.getAddress());
			}
			
		});
		System.out.println("Student records sorted by address : "+ stdList);

	
	}
	
	

}
