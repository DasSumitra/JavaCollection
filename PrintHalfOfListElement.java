package com.nt.logical;

import java.util.ArrayList;
import java.util.List;

public class PrintHalfOfListElement {

	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		System.out.println(nums);
		System.out.println(nums.size());
		for(int i=0;i<nums.size()/2;i++) {
			System.out.println(nums.get(i));
			
		}
	}

}
