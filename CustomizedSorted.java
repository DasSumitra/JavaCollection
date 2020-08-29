package com.nt.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizedSorted {

	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<>();
		nums.add(80);
		nums.add(90);
		nums.add(50);
		nums.add(70);
		nums.add(100);
		nums.add(10);
		System.out.println("List elements are : "+nums);
		Collections.sort(nums);
		System.out.println("List elements are asending order: "+nums);
		Collections.reverse(nums);
		System.out.println("List elements are desending order: "+nums);
		
		List<Integer> list = nums.stream().sorted().collect(Collectors.toList());
		System.out.println("Asending order list elements are : "+list);
		
		List<Integer> list2 = nums.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("Desending order list elements are : "+list2);
		
	}

}
