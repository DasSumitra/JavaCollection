package com.list.operations;

import java.util.ArrayList;
import java.util.List;

public class TestArrayToList {

	public static void main(String[] args) {
		/*
		 * List<Integer>list=new ArrayList<>(Arrays.asList(10,20,30,40));
		 * System.out.println("List elements are .."+list);
		 */
		/*
		 * List<String>list=new ArrayList<>(Arrays.asList("A","B","C","D"));
		 * System.out.println("List Elements are :"+list);
		 */
		String[]str= {"A","B","C","D","E"};
		List<String>list=new ArrayList<>(str.length);
		for(String s:str) {
			list.add(s);
		}
		System.out.println("List elements are : "+list);
	}

}
