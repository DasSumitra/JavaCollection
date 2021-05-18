package com.nt.list.test;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsExample {

	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<Integer>();
		System.out.println(nums.isEmpty());
		System.out.println(nums.size());
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		System.out.println(nums.isEmpty());
		System.out.println(nums.size());
		System.out.println(nums);
		nums.add(6, 70);
		//nums.add(8, 70);
		System.out.println(nums);
		List<Integer>nums2=new ArrayList<Integer>();
		nums2.add(80);
		nums2.addAll(nums);
		System.out.println(nums2);
		List<Integer>nums3=new ArrayList<Integer>();
		nums3.add(90);
		nums3.addAll(1, nums2);
		System.out.println(nums3);
		System.out.println(nums.contains(20));
		System.out.println(nums.contains(200));
		System.out.println(nums2.containsAll(nums));
		System.out.println(nums2.containsAll(nums3));
		System.out.println(nums.indexOf(10));
		//System.out.println(nums.indexOf(0));
		System.out.println(nums.lastIndexOf(30));
		//nums.clear();
		System.out.println(nums);
		System.out.println(nums.remove(0));
		//System.out.println("nums2...."+nums2);
		//System.out.println(nums2.removeAll(nums));
		//System.out.println("after remove  nums...."+nums2);
		System.out.println(nums2+".........");
		nums2.retainAll(nums);
		System.out.println(nums2+"*****");
	}

}
