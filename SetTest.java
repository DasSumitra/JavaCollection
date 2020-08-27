package com.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer>setNums=new HashSet<>();
		setNums.add(10);
		setNums.add(30);
		setNums.add(20);
		setNums.add(40);
		setNums.add(50);
		setNums.add(60);
		System.out.println("Print HashSet elements :"+setNums);
		Set<Integer>setNums2=new LinkedHashSet<>();
		setNums2.add(10);
		setNums2.add(30);
		setNums2.add(20);
		setNums2.add(40);
		setNums2.add(50);
		setNums2.add(60);
		System.out.println("Print LinkedHashSet elements : "+setNums2);
		
		Set<Integer>setNums3=new TreeSet<>();
		setNums3.add(10);
		setNums3.add(30);
		setNums3.add(20);
		setNums3.add(40);
		setNums3.add(50);
		setNums3.add(60);
		System.out.println("Print TreeSet elements : "+setNums3);
	}

}
