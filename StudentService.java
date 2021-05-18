package com.map.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentService {

	public  List<Student> getAllStudents(Map<Integer, Student> studentMap) {
		List<Student> studentList = new ArrayList<>();

		for (Integer key : studentMap.keySet()) {
			Student student = studentMap.get(key);
			studentList.add(student);
		}
		return studentList;

	}

	public  Student getStudentById(Student student) {
		return student;
	}

	public  Student updateStudentById(Student student) {
		student.getSid();
		student.setName("xyz");
		return student;
	}
	public  int removeStudent(Student student) {
		return student.getSid();
	}
}
