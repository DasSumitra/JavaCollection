package com.nt.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionListTest {

	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		System.out.println(nums);
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		for (Integer i : nums) {
			System.out.println(i);
		}
		Iterator<Integer> it = nums.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
