package com.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSetCllection {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println("Set elements are :"+set);
		for(Integer i:set) {
			System.out.println("print all set elements "+i);
		}
		Iterator<Integer>it=set.iterator();
		while(it.hasNext()) {
			System.out.println("elements are "+it.next());
		}
	}

}
