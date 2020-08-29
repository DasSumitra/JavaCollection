package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodTest {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(7);
		list.add(3);
		list.add(6);
		System.out.println("print the list elements : "+list);
		for(Integer i:list) {
			i=i+5;
			System.out.println("print all the elements after adding 5 :"+i);
		}
		List<Integer> list2 = list.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("print list2 elements after adding 5 :"+list2);
		
	}

}
