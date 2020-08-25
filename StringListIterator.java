package com.list.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringListIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Grapes");
		System.out.println("List elements are :"+list);
		Iterator<String>it=list.iterator();
		while(it.hasNext()) {
			System.out.println("After iteration "+it.next());
		}
		list.remove(3);
		System.out.println("after remove specified index elemnts are "+list);
		list.clear();
		System.out.println("after clear() call "+list);
	}

}
