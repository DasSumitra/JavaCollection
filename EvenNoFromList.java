package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoFromList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("print the list elements : " + list);

		for (Integer i : list) {
			if (i % 2 == 0) {
				System.out.println("print even no " + i);
			}
		}

		List<Integer> resultList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("print all the even number from the given list : " + resultList);
	}

}
