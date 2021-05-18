package com.nt.logical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(10);
		nums.add(30);
		nums.add(20);
		nums.add(10);
		nums.add(40);
		System.out.println(nums);
		Set<Integer>setNums=new HashSet<Integer>(nums);
		System.out.println(setNums);
	}

}
