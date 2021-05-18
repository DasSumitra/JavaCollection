package com.map.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer, Student> studentMap = new HashMap<>();
		Student st1 = new Student(1001, "Ayush", "Bangalore");
		Student st2 = new Student(1002, "Akash", "Hyd");
		Student st3 = new Student(1003, "Mohit", "Mumbai");
		Student st4 = new Student(1004, "Ashrita", "Kerla");

		studentMap.put(st1.getSid(), st1);
		studentMap.put(st2.getSid(), st2);
		studentMap.put(st3.getSid(), st3);
		studentMap.put(st4.getSid(), st4);

		StudentService studentService=new StudentService();
		List<Student> students = studentService.getAllStudents(studentMap);
		System.out.println(students);
		Student studentById = studentService.getStudentById(studentMap.get(1001));
		System.out.println(studentById);
		Student updateStudentById = studentService.updateStudentById(studentMap.get(1001));
		System.out.println(updateStudentById);
		int removeStudent = studentService.removeStudent(studentMap.remove(1001));
		System.out.println(removeStudent);
		System.out.println(studentMap);

	}

	
}
