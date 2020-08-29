package com.nt.stream;

import java.util.ArrayList;
import java.util.List;

public class CountTest {

	public static void main(String[] args) {
		List<Integer>marks=new ArrayList<>();
		marks.add(30);
		marks.add(40);
		marks.add(35);
		marks.add(45);
		marks.add(25);
		System.out.println("print all list of marks "+marks);
		for(Integer i:marks) {
			if(i>35) {
				System.out.println("print pass mark of students "+i);
			}
		}
		Long list = marks.stream().filter(i->i>35).count();
		System.out.println("Passed students "+list);
	}

}
