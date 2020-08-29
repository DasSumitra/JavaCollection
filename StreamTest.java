package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(9);
		list.add(8);
		list.add(5);
		list.add(6);
		list.add(4);
		for(Integer i:list) {
			System.out.println("list all elements :"+i);
		}
		List<Integer> list2 = list.stream().collect(Collectors.toList());
		System.out.println("list2 all elements :"+list2);
	}

}
