package com.set.test;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		Set<Character> charSet = new TreeSet<>();
		//charSet.add(null);

		charSet.add('b');
		charSet.add('d');
		charSet.add('a');
		charSet.add('p');
		charSet.add('o');

		System.out.println("Print tree set elements :" + charSet);
	}

}
