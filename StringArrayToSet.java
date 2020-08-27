package com.set.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringArrayToSet {

	public static void main(String[] args) {
		String[]str= {"I","Love","My","India"};
		Set<String>set=new HashSet<>(Arrays.asList(str));//1st approach
		System.out.println("Print set elements :"+set);
		Collections.addAll(set, str);//2nd approach
		System.out.println("print 2nd apporach of convertion :"+set);
	}

}
