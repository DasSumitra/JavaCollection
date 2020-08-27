package com.set.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Ankit");
		list.add("Mohit");
		list.add("Sumitra");
		list.add("Manoj");
		list.add("Mohit");
		list.add("Sumitra");
		System.out.println("print list elelments :"+list);
		Set<String>setNames=new HashSet<>(list);
		System.out.println("Set elements are :"+setNames);
	}

}
