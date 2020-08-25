package com.list.operations;

import java.util.ArrayList;
import java.util.List;

public class StringListToArray {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("I");
		list.add("Love");
		list.add("Java");
		System.out.println(list);
		String[]str=new String[list.size()];
		for(int i=0;i<list.size();i++) {
			str[i]=list.get(i);
			System.out.println("Print array element .."+str[i]);
		}
		String[]str2=list.toArray(new String[0]);
		for(int i=0;i<list.size();i++) {
			str2[i]=list.get(i);
			System.out.println("String array elements : "+str2[i]);
		}
	}

}
