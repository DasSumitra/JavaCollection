package com.map.test;

public class StudentTest {

	public static void main(String[] args) {
		StudentDAO stDao=new StudentDAO();
		Student student=new Student(1001, "Sumitra", "Odisha");
		Student student1=new Student(1002, "Ayush", "Bangalore");
		Student student2=new Student(1003, "Ashrita", "HYD");
		System.out.println(stDao.insertStudent(student));
		System.out.println(stDao.insertStudent(student1));
		System.out.println(stDao.insertStudent(student2));
		System.out.println(stDao.getStudent(1001));
		System.out.println(stDao.removeStudent(1002));
		System.out.println(stDao.getAllStudent());
		System.out.println(stDao.updateStudent(1002));
	}

}
