package com.list.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteration {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("List Elements are .."+list);
		for(Integer i:list) {
			System.out.println("list iteration "+i);
			
		}
		ListIterator<Integer>it=list.listIterator();
		while(it.hasNext()) {
			System.out.println("list iteration using listItearator : "+it.next());
			System.out.println("Previous element index : "+it.previousIndex());
			System.out.println("Previous element  : "+it.hasPrevious());
			//System.out.println(it.previous());
			//System.out.println(it.next());
		}
	}

}
