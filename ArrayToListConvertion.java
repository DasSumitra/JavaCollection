package com.list.operations;

import java.util.ArrayList;
import java.util.List;

public class ArrayToListConvertion {

	public static void main(String[] args) {
		int[]arr= {100,102,103,104,105,106};
		List<Integer>list=new ArrayList<>(arr.length);
		for(int i:arr) {
			list.add(i);
		}
		System.out.println("List elements are :"+list);
		
	}

}
