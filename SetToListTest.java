package com.set.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListTest {

	public static void main(String[] args) {
		Set<String>setNames=new HashSet<>();
		setNames.add("Ayush");
		setNames.add("Ankit");
		setNames.add("Manoj");
		setNames.add("Ayush");
		System.out.println("Set Names are :"+setNames);
		List<String>listNames=new ArrayList<>(setNames);
		System.out.println("Print list of names :"+listNames);
	}

}
