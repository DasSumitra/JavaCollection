package com.set.test;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		System.out.println("Set size  : "+set);
		System.out.println("check set elements : "+set.isEmpty());
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println("Set size  : "+set);
		System.out.println("check set elements : "+set.isEmpty());
		System.out.println("element is present in the set or not :"+set.contains(30));
		System.out.println("element is present in the set or not :"+set.contains(90));
		System.out.println("Remove specified element from the set : "+set.remove(30));
		System.out.println("After remove element from set : "+set);
		set.clear();
		System.out.println(" after clear() the set : "+set);
		Set<Integer>set2=new HashSet<>();
		System.out.println("Retaion All : "+set.retainAll(set2));
		System.out.println(set2);
		
		
		
	}

}
