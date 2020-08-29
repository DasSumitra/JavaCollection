package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumber {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<50;i++) {
			list.add(i);
		}
		System.out.println("print the list elements : "+list);
		for(Integer i:list) {
			if(i%2==0) {
				System.out.println("print all the even numbers : "+i);
			}
		}
		List<Integer> list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("print list2 even numbers :"+list2);
	}

}
