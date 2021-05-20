package com.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentDAO {
	Map<Integer,Student>studentMap=new  HashMap<>();
	
	public String insertStudent(Student student) {
		if(student!=null) {
		studentMap.put(student.getSid(), student);
		return "Success";
		}
		
		return null;
	}
	public Student getStudent(int sid) {
		if(studentMap.containsKey(sid)) {
		Student student = studentMap.get(sid);
		return student;
		}
		return null;
	}
	public String removeStudent(int sid) {
		if(studentMap.containsKey(sid)) {
			studentMap.remove(sid);
			return "Remove Student data successfully";
		}
		
		return "Studnet Data is not available";
	}
	public List<Student>getAllStudent(){
		List<Student>students=new ArrayList<>();
		for (Entry<Integer, Student> entry : studentMap.entrySet()) {
			Student student = entry.getValue();
			students.add(student);
		}
		
		return students;
	}
	public String updateStudent(int sid) {
		if(studentMap.containsKey(sid)) {
			Student student = studentMap.get(sid);
			studentMap.put(sid, student);
			return "Student Data updated successfully";
		}
		return "invalid Student ID";
	}

}
