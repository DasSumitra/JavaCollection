package com.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOperations {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		//map.put(5, "test");
		System.out.println(map);
		for (Integer key : map.keySet()) {
			System.out.println("keys are .. "+key);
		}
		for (String value : map.values()) {
			System.out.println("values are .. "+value);
		}
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("map elements  ... "+entry);
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			
		}
		//String remove = map.remove(1);
		boolean remove = map.remove(9, "one");
		System.out.println(remove);
		System.out.println(map);
		//map.clear();
		//System.out.println(map);
		boolean containsKey = map.containsKey(2);
		System.out.println(containsKey);
		System.out.println(map.containsValue("two"));
		
		String value = map.get(4);
		System.out.println(value);
		System.out.println(map.isEmpty());
		map.replace(2, "TWO");
		System.out.println(map+".........");
		Map<Integer,String>map2=new HashMap<>();
		map2.put(10, "A");
		map2.put(20, "B");
		map2.put(30, "C");
		map2.put(40, "D");
		System.out.println(map2);
		map.putAll(map2);
		System.out.println("map elements "+map);
	}

}
