package com.nt.logical;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArrayWithoutSet {

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
		List<Integer>nums2=new ArrayList<Integer>();
		for (Integer element : nums) {
			if(!nums2.contains(element)) {
				nums2.add(element);
			}
		}
		System.out.println(nums2);
		
	}

}
