package com.set.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		Integer[]arr= {10,20,30,40,50};
		Set<Integer>set=new HashSet<>(Arrays.asList(arr));// 1st approach
		System.out.println("print the set elements after convertion :"+set);
		for(Integer i:set) {
			//set.add(200); ConcurrentModificationException
		}
		//System.out.println("print new set after adding element "+set);
		Set<Integer>set2=new HashSet<>();
		Collections.addAll(set2, arr);//2nd approach
		System.out.println("print set2 :"+set2);
	}

}
