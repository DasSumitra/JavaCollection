package com.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		Integer[]itr=set.toArray(new Integer[set.size()]);//1st approach
		for(int i=0;i<set.size();i++) {
			System.out.println("Integer array elements are "+itr[i]);
		}
		Integer[]arr=set.toArray(new Integer[set.size()]);
		System.out.println("Integer array elements are "+Arrays.toString(arr));
		
	}

}
