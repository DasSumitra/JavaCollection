package com.test.exception;

public class Test {

	public static void main(String[] args) {
		StudentRegistration studentRegistration = new StudentRegistration();
		Student student=new Student("Sumitra", "Bangalore");
		System.out.println(studentRegistration.registerStudent(student));
		System.out.println(studentRegistration.registerStudent(null));
	}

}
