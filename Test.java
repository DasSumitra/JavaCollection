package com.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1010, "one");
		map.put(1020, "two");
		map.put(1030, "three");
		map.put(1020, "twenty");
		map.put(1030, "thirty");
		System.out.println("Map elements "+map);
		List<Integer>list=new ArrayList<>();
		list.add(3030);
		list.add(4040);
		list.add(null);
		list.add(5050);
		list.add(null);
		System.out.println("List elements are "+list);
		Set<Integer>set=new HashSet<>();
		set.add(9090);
		set.add(9010);
		set.add(9030);
		set.add(null);
		System.out.println("set elements "+set);
	}

}
