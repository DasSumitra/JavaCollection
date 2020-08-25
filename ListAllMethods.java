package com.list.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAllMethods {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		System.out.println("Size of the list .."+list.size());
		System.out.println("Check is the list is empty or not : "+list.isEmpty());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("List Elements are .."+list);
		System.out.println("Size of the list .."+list.size());
		System.out.println("index starts with location of "+list.indexOf(10));
		System.out.println("Check is the list is empty or not :"+list.isEmpty());
		list.add(100);
		System.out.println("Check the add element "+list);
		System.out.println("check the element present in the list or not :"+list.contains(30));
		System.out.println("get the specified element from the list "+list.get(4));
		System.out.println("Remove the element from the list : "+list.remove(4));
		System.out.println("get the specified element from the list "+list.get(4));
		System.out.println("replace the element at the specified position in the list : "+list.set(5, 90));
		//System.out.println("replace the element at the specified position in the list : "+list.set(10, 999));
		System.out.println("after replace elemnts list elements are : "+list);
		System.out.println("create a sub list based on specified index : "+list.subList(2, 4));
		List<Integer>list2=new ArrayList<>();
		List<Integer>list3=new ArrayList<>();
		list2.add(10);
		list2.add(30);
		//System.out.println("RetainAll the list :"+list.retainAll(list3));
		System.out.println("RetainAll the list :"+list.retainAll(list2));
		System.out.println("RetainAll the list :"+list.retainAll(list3));
	}

}
