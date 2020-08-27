package com.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1010, "Ayush");
		map.put(1020, "Ajay");
		map.put(1030, "Manoj");
		map.put(1040, "Ritika");
		map.put(1050, "Rima");
		System.out.println("Map elements are :"+map);
		
		Map<Integer,String>linkedMap=new LinkedHashMap<>();
		linkedMap.put(1010, "Ayush");
		linkedMap.put(1020, "Ajay");
		linkedMap.put(1030, "Manoj");
		linkedMap.put(1040, "Ritika");
		linkedMap.put(1050, "Rima");
		System.out.println("LinkedHashMap elements are :"+linkedMap);
		
		Map<Integer,String>treeMap=new TreeMap<>();
		treeMap.put(1060, "Ayush");
		treeMap.put(1020, "Ajay");
		treeMap.put(1010, "Manoj");
		treeMap.put(1040, "Ritika");
		treeMap.put(1050, "Rima");
		System.out.println("TreeMap elements are :"+treeMap);
		
	}

}
