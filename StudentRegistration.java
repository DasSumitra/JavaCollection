package com.test.exception;

public class StudentRegistration {
	
	
	
	public Student registerStudent(Student student) {
		if(student==null) {
			throw new MyExceptionTest("Please insert value ",400);
		}
		
		return student;
	}
	

}
