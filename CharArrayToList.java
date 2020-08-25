package com.list.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharArrayToList {

	public static void main(String[] args) {
		List<Character>list=new ArrayList<>(Arrays.asList('a','b','c'));
		System.out.println("Print list elements : "+list);
		char[]ch= {'m','n','o','p'};
		List<Character>list2=new ArrayList<>(ch.length);
		for(char c:ch) {
			list2.add(c);
		}
		System.out.println("array elements :"+list2);
	}

}
