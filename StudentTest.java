package com.nt.list.test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	

	public static void main(String[] args) {
		int count = 0;
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student(1001, "Sumitra", "Bangalore");
		Student student2 = new Student(1002, "Ayush", "HYD");
		Student student3 = new Student(1003, "Manoj", "Mumbai");
		Student student4 = new Student(1004, "Mohit", "Mumbai");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		List<Student> students2 = new ArrayList<Student>();
		for (Student student : students) {
			System.out.println(student);
		}
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		for (Student student : students) {
			if(student.getAddress().equals("Mumbai")) {
				count++;
				students2.add(student);
				System.out.println(student+"..............");
			}
		}
		System.out.println(count+".....");
		System.out.println(students2);
	}

}
