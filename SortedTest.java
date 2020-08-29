package com.nt.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTest {

	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<>();
		nums.add(90);
		nums.add(80);
		nums.add(50);
		nums.add(10);
		nums.add(5);
		System.out.println("List elements are : "+nums);
		Collections.sort(nums);
		System.out.println("List elements are after sorting : "+nums);
		List<Integer> list = nums.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sotring elements are : "+list);
	}

}
