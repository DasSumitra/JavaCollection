package com.list.employee.name;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Manoj");
		list.add("Sumitra");
		list.add("Manoj");
		list.add("Akash");
		list.add("Manoj");
		System.out.println(list.size());
		Set<String>set=new HashSet<>(list);
		System.out.println(set.size());
	}

}
