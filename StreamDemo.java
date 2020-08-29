package com.stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(5);
		l.add(25);
		System.out.println("All the elements of list   ..."+l);
		/*
		 * ArrayList<Integer>l1=new ArrayList<>(); for(Integer i1:l) { l1.add(i1*2); }
		 * System.out.println("Print the double value of each elements on array.."+l1);
		 */
		List<Integer>l2=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("Print the double value of all the elements  : "+l2);
		
	}

}
