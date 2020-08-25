package com.list.operations;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("List elements are : "+list);
		Integer[]arr=new Integer[list.size()];
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
			System.out.println("Array elemnts are : "+arr[i]);
		}
		Integer[]arr2=list.toArray(new Integer[0]);
		for(Integer i:arr) {
			System.out.println("Array lements are 2 "+i);
		}
	}

}
